"use strict";$(function(){var e=document.getElementById("story-video");videoPlay(e)}),$(function(){var e=0,n=null,t=$(".experience_dot_nav li").length;function i(){$(".experience_dot_nav li").eq(e).addClass("active").siblings().removeClass("active"),$(".experience_tab_content .experience_tab_box").eq(e).fadeIn(300).siblings().hide()}function c(){n=setInterval(function(){t<++e&&(e=0),i()},3500)}console.log(t),$(".experience_dot_nav li").click(function(){e=$(this).index(),clearInterval(n),i()}),$(".experience_dot_nav li,.experience_tab_content").hover(function(){clearInterval(n)},function(){c()}),c()});