(ns web-site.web
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [hiccup.page :refer [html5]]
            [hiccup.element :refer (link-to image)]
            [me.raynes.cegdown :as md]
            [stasis.core :as stasis]))

(defn style-block []
			"@media only screen and (max-width:64.9ch) { body.siteIndex #markdownBody li { line-height: 1.65; } }
    /* general */
  		html{padding:0;margin:0;background-color:#fff;color:#000;font-weight:400}
  		body{max-width:112ch,padding:0, 1.5ch 0 .5ch;margin:0 auto;font-family:Verdana, Geneva, sans-serif; font-size:10pt; color:black;}
  		main{min-height:100vh;display:flex;flex-flow:column}
  		#sidebar{padding:5ch;padding-top:10ch;}
  		#sidebar code{border:none;background-color:transparent}
  		#sidebar a{display:block}
  		article,header{margin-left:15ch;margin-right:20ch}
  		#markdownBody{ovarflow-wrap:break-word}")


(defn layout-page [page]
  (html5
      [:head
       [:meta {:charset "utf-8"}]
       [:style (style-block)]
       [:title "Just another page"]]
       [:body
        [:div {:id "sidebar"}
         [:div {:id "sidebar-links"}
          [:a {:class "home"} (link-to "/index" "Home")]
          [:a {:class "website"} (link-to "/this-site" "website")]
          [:a {:class "me"} (link-to "/index" "me")]
          [:a {:class "Github"} (link-to "/index" "Github")]]]
        [:article [:div {:id "markdownBody"} page]]]))



(def pegdown-options ;; https://github.com/sirthias/pegdown
  [:autolinks :fenced-code-blocks :strikethrough])

(defn render-markdown-page [page]
  (layout-page (md/to-html page pegdown-options)))

(defn markdown-pages [pages]
  (zipmap (map #(str/replace % #"\.md$" "") (keys pages))
          (map #(layout-page (md/to-html %)) (vals pages))))

(defn index-page [pages]
  (zipmap (map #(str/replace % #"\.md$" ".html") (keys pages))
          (map #(layout-page (md/to-html %)) (vals pages))))

(defn get-pages []
  (stasis/merge-page-sources
   {:markdown
    (markdown-pages (stasis/slurp-directory "resources/pages" #"\.md$"))
    :index
    (index-page (stasis/slurp-directory "resources" #"\.md$"))}))


(def app (stasis/serve-pages get-pages))