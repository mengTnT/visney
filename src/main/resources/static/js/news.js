"use strict";$.ajax({url:"http://192.168.100.250/article/getArticleCenterRecommends",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleText.replace(/<\/?.+?>/g,"").replace(/(^\s+)|(\s+$)/g,"").replace(/\s/g,"");a=0==e?a.length<136?a:a.substring(0,136).trim().concat("..."):a.length<42?a:a.substring(0,42).trim().concat("...");var c='<li class="recom-info-list">\n                \t\t<div class="recom-info-img"><a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'"><img src="'+t.articleImg.articleImgSrc+'" alt="'+t.articleImg.articleImgAlt+'"></a></div>\n                \t\t<div class="recom-info-title-box">\n                \t\t\t<div class="recom-info-title">\n                \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n                \t\t\t</div>\n                \t\t\t<div class="recom-info-times">\n                \t\t\t\t<p>'+t.articleAddTime+'</p>\n                \t\t\t</div>\n                \t\t</div>\n                \t\t<div class="recom-info-deesc">'+a+'</div>\n                \t\t<div class="recom-info-more">\n                \t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">了解更多</a>\n                \t\t</div>\n                \t</li>';$(".recom-info-content ul").append(c)})},error:function(t){alert("请求错误！")}}),$.ajax({url:"http://192.168.100.250/article/getRecommendsByCategoryId/1/5",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleText.replace(/<\/?.+?>/g,"").replace(/(^\s+)|(\s+$)/g,"").replace(/\s/g,"").substring(0,90).trim().concat("..."),c='<li class="company-info-list">\n                \t\t\t<div class="company-info-title">\n                \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n                \t\t\t</div>\n                \t\t\t<div class="company-info-desc">'+a+"</div>\n                \t\t</li>";$(".company-info-content ul").append(c)})},error:function(t){alert("请求错误！")}}),$.ajax({url:"http://192.168.100.250/article/getRecommendsByCategoryId/5/5",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleText.replace(/<\/?.+?>/g,"").replace(/(^\s+)|(\s+$)/g,"").replace(/\s/g,"").substring(0,90).trim().concat("..."),c='<li class="industry-info-list">\n                            <div class="industry-info-title">\n                                <a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n                            </div>\n                            <div class="industry-info-desc">'+a+"</div>\n                        </li>";$(".industry-info-content ul").append(c)})},error:function(t){alert("请求错误！")}}),$.ajax({url:"http://192.168.100.250/article/getRecommendsByCategoryId/2/5",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleText.replace(/<\/?.+?>/g,"").replace(/(^\s+)|(\s+$)/g,"").replace(/\s/g,"");a=0==e?a.length<115?a:a.substring(0,115).trim().concat("..."):a.length<32?a:a.substring(0,32).trim().concat("...");var c='<li class="furniture-encyclopedia-list">\n\t\t\t\t\t\t<div class="fur-ency-list-img">\n\t\t\t\t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'"><img src="'+t.articleImg.articleImgSrc+'" alt="'+t.articleImg.articleImgAlt+'"></a>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div class="fur-ency-list-title">\n\t\t\t\t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div class="fur-ency-list-desc">'+a+'</div>\n\t\t\t\t\t\t<div class="fur-ency-list-time">\n\t\t\t\t\t\t\t<p>'+t.articleUpdateTime+"</p>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</li>";$(".furniture-encyclopedia-content ul").append(c)})},error:function(t){alert("请求错误！")}}),$.ajax({url:"http://192.168.100.250/article/getRecommendsByCategoryId/3/5",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleText.replace(/<\/?.+?>/g,"").replace(/(^\s+)|(\s+$)/g,"").replace(/\s/g,"");a=0==e?a.length<115?a:a.substring(0,115).trim().concat("..."):a.length<32?a:a.substring(0,32).trim().concat("...");var c='<li class="brand-selection-list">\n            \t\t\t<div class="brand-selection-list-img">\n            \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'"><img src="'+t.articleImg.articleImgSrc+'" alt="'+t.articleImg.articleImgAlt+'"></a>\n            \t\t\t</div>\n            \t\t\t<div class="brand-selection-list-title">\n            \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n            \t\t\t</div>\n            \t\t\t<div class="brand-selection-list-desc">'+a+'</div>\n            \t\t\t<div class="brand-selection-list-time">\n            \t\t\t\t<p>'+t.articleUpdateTime+"</p>\n            \t\t\t</div>\n            \t\t</li>";$(".brand-selection-content ul").append(c)})},error:function(t){alert("请求错误！")}}),$.ajax({url:"http://192.168.100.250/article/getRecommendsByCategoryId/4/5",type:"GET",success:function(t){t.forEach(function(t,e,i){var a=t.articleUpdateTime.substring(5,10),c='<li class="decoration-place-list">\n            \t\t\t<div class="decoration-place-img">\n            \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'"><img src="'+t.articleImg.articleImgSrc+'" alt="'+t.articleImg.articleImgAlt+'"></a>\n            \t\t\t</div>\n            \t\t\t<div class="decoration-place-title">\n            \t\t\t\t<a href="news-view.html?newsListId='+t.articleCategoryId+"&articleId="+t.articleId+'">'+t.articleName+'</a>\n            \t\t\t</div>\n            \t\t\t<div class="decoration-place-time"><p>'+a+"</p></div>\n            \t\t</li>";$(".decoration-place-content ul").append(c)})},error:function(t){alert("请求错误！")}});