"use strict";function getProdAjax(t){$(t).delegate("li","click",function(){$(".products-show-box ul").empty(),$(this).parents()[2]==$("div.products-sequence")[0]?$(this).hasClass("active")?($(this).removeClass("active"),$(this).attr("data-id",0)):($(".products-sequence").find("li").removeClass("active"),$(".products-sequence").find("li").attr("data-id",0),$(this).addClass("active").siblings().removeClass("active"),$(this).attr("data-id",1)):$(this).addClass("active").siblings().removeClass("active");var t={positionId:$(".furniture-place-kinds-list.active").attr("data-id"),typeId:$(".furniture-class-kinds-list.active").attr("data-id"),textureId:$(".furniture-materials-kinds-list.active").attr("data-id"),seriesId:$(".furniture-series-kinds-list.active").attr("data-id"),styleId:$(".furniture-style-kinds-list.active").attr("data-id"),orderByTime:$(".news-products-list").attr("data-id"),orderByPageViewsCount:$(".sales-volume-list").attr("data-id"),orderByPrice:$(".products-prices-list").attr("data-id")};$.ajax({url:"http://192.168.100.250/product/selectByCondition/1/12",method:"POST",dataType:"json",async:!0,data:t,success:function(t){var i=t.total,a=Math.ceil(i/12);if(0==i){$(".products-show-box ul").html("<p>还没有类似产品哦^_^，请选择其他相关产品，O(∩_∩)O谢谢！</p>"),$(".products-pagination-box").hide()}else $(".products-pagination-box").pagination({mode:"fixed",coping:!0,homePage:"<<",endPage:">>",pageCount:a,jump:!1,callback:function(t){getProdPgAjax(t.getCurrent(),12)}},function(){getProdPgAjax(1,12)})}})})}function getProdPgAjax(t,i){$(".products-show-box ul").empty();var a={positionId:$(".furniture-place-kinds-list.active").attr("data-id"),typeId:$(".furniture-class-kinds-list.active").attr("data-id"),textureId:$(".furniture-materials-kinds-list.active").attr("data-id"),seriesId:$(".furniture-series-kinds-list.active").attr("data-id"),styleId:$(".furniture-style-kinds-list.active").attr("data-id"),orderByTime:$(".news-products-list").attr("data-id"),orderByPageViewsCount:$(".sales-volume-list").attr("data-id"),orderByPrice:$(".products-prices-list").attr("data-id")};$.ajax({url:"http://192.168.100.250/product/selectByCondition/"+t+"/"+i,method:"POST",dataType:"json",async:!0,data:a,success:function(t){var a="";$.each(t.list,function(t,i){a+='<li class="products-kind-list">\n\t\t\t\t\t\t\t\t<div class="products-kind-list-img">\n\t\t\t\t\t\t\t\t\t<a href="prod-view.html?typeId='+i.proPositionId+"&Id="+i.proTypeId+"&fid="+i.proId+'"><img src="'+i.proImgs[0].proImgSrc+'" alt="'+i.proImgs[0].proImgAlt+'"></a>\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t<div class="products-kind-name">\n\t\t\t\t\t\t\t\t\t<a href="prod-view.html?typeId='+i.proPositionId+"&Id="+i.proTypeId+"&fid="+i.proId+'">'+i.proName+'</a>\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t\t<div class="products-kind-price">\n\t\t\t\t\t\t\t\t\t￥<span class="price-num">'+i.proPrice+"</span>\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</li>"}),$(".products-show-box ul").append(a)}})}!function(){var a=$.getUrlParam("typeId");$.getUrlParam("Id");$.ajax({url:"http://192.168.100.250/proCategory/showAll/main",type:"GET",success:function(t){var i='<a href="products.html?typeId='+t[a-1].proCategoryId+'">'+t[a-1].proCategoryName+"</a>";$(".brand-nav-list ul li:last-child").html(i)}})}(),function(){var i=$.getUrlParam("typeId"),t=$.getUrlParam("Id");$.ajax({url:"http://192.168.100.250/proCategory/showAll/main",type:"GET",success:function(t){t.forEach(function(t,i,a){var r='<li data-id="'+t.proCategoryId+'" class="furniture-place-kinds-list"><a href="prod-list.html?typeId='+t.proCategoryId+'">'+t.proCategoryName+"</a></li>";$(".furniture-place-kinds ul").append(r)}),$(".furniture-place-kinds ul").children("li").eq(i-1).addClass("active"),t[i-1].children.forEach(function(t,i,a){var r='<li data-id="'+t.proCategoryId+'" class="furniture-class-kinds-list">'+t.proCategoryName+"</li>";$(".furniture-class-kinds ul").append(r)})},complete:function(){getProdAjax(".furniture-class-kinds ul"),t?($(".furniture-class-kinds ul").children("li[data-id="+t+"]").addClass("active"),$(".furniture-class-kinds ul").children("li[data-id="+t+"]").trigger("click")):($(".furniture-class-kinds ul").children("li[data-id='']").addClass("active"),$(".furniture-class-kinds ul").children("li[data-id='']").eq(0).trigger("click"))}}),$.ajax({url:"http://192.168.100.250/proCategory/showAll/list",type:"GET",success:function(t){t[0].children.forEach(function(t,i,a){var r='<li data-id="'+t.proCategoryId+'" class="furniture-materials-kinds-list">'+t.proCategoryName+"</li>";$(".furniture-materials-kinds ul").append(r)}),t[1].children.forEach(function(t,i,a){var r='<li data-id="'+t.proCategoryId+'" class="furniture-series-kinds-list">'+t.proCategoryName+"</li>";$(".furniture-series-kinds ul").append(r)}),t[2].children.forEach(function(t,i,a){var r='<li data-id="'+t.proCategoryId+'" class="furniture-style-kinds-list">'+t.proCategoryName+"</li>";$(".furniture-style-kinds ul").append(r)})},complete:function(){$(".furniture-materials-kinds ul").children("li[data-id='']").addClass("active"),$(".furniture-series-kinds ul").children("li[data-id='']").addClass("active"),$(".furniture-style-kinds ul").children("li[data-id='']").addClass("active"),getProdAjax(".furniture-materials-kinds ul"),getProdAjax(".furniture-series-kinds ul"),getProdAjax(".furniture-style-kinds ul"),getProdAjax(".sales-volume ul"),getProdAjax(".news-products ul"),getProdAjax(".products-prices ul")}})}();