"use strict";!function(){var n=$.getUrlParam("newsListId"),r=$.getUrlParam("articleId");$.ajax({url:"http://192.168.100.250/article/getArticleDetails/"+r,type:"GET",success:function(e){var t='<div class="news-view-tag"><a href="javascript:viod(0);">'+e.labelList[0].articleLabelName+'</a></div><div class="news-view-tag"><a href="javascript:viod(0);">'+e.labelList[1].articleLabelName+"</a></div>";$(".news-view-title p").text(e.articleName),$(".news-view-sort-cont").text(e.articleCategory.articleCategoryName),$(".news-view-edit-cont").text(e.articleEditor.articleEditorName),$(".news-view-access-cont").text(e.pageViews.pageViewsCount),$(".news-view-time-cont").text(e.articleUpdateTime),$(".news-view-details").html(e.articleText),$(".news-view-tag-box").html(t)}}),$.ajax({url:"http://192.168.100.250/article/getArticleNextAndBefore/"+n+"/"+r,type:"GET",success:function(e){var t=e.list.length,a='<a href="questions-view.html?newsListId='+n+"&articleId="+e.list[0].articleId+'"><span>上一篇:</span><span class="news-view-prev-title">'+e.list[0].articleName+"</span></a>",s='<a href="questions-view.html?newsListId='+n+"&articleId="+e.list[0].articleId+'"><span>下一篇:</span><span class="news-view-prev-title">'+e.list[0].articleName+"</span></a>";if(1==t)e.list[0].articleId<r?($(".news-view-prev").html(a),$(".news-view-next").html('<a href="javascript:;"><span>下一篇:</span><span class="news-view-next-title">没有下一篇啦^_^</span></a>')):($(".news-view-prev").html('<a href="javascript:;"><span>上一篇:</span><span class="news-view-prev-title">没有上一篇啦^_^</span></a>'),$(".news-view-next").html(s));else{var i='<a href="questions-view.html?newsListId='+n+"&articleId="+e.list[0].articleId+'"><span>上一篇:</span><span class="news-view-prev-title">'+e.list[0].articleName+"</span></a>",l='<a href="questions-view.html?newsListId='+n+"&articleId="+e.list[1].articleId+'"><span>下一篇:</span><span class="news-view-next-title">'+e.list[1].articleName+"</span></a>";$(".news-view-prev").html(i),$(".news-view-next").html(l)}}})}();