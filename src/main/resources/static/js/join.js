"use strict";!function(){var r=$(".join_partners_banner ul"),e=r.find(".join_partners_list").outerWidth(!0),t=r.find(".join_partners_list").length,n=$(".join_partners_banner_pre"),i=$(".join_partners_banner_next"),a=$(".join_partners_banner").width();if(r.css({width:e*t}),4<t){var s=Date.now();n.bind("click",function(){var n=Date.now(),i=parseInt(r.css("marginLeft"));if(500<n-s){if(-e<i)return void r.css("marginLeft","0");r.animate({marginLeft:i+e+"px"},500)}s=n}),i.bind("click",function(){var n=Date.now(),i=parseInt(r.css("marginLeft"));if(500<n-s){if(t*e-8*(t-1)<=a-i)return void $(".join_partners_banner").css("paddingRight","0px");r.animate({marginLeft:-e+i+"px"},500)}s=n})}else n.hide(),i.hide()}();