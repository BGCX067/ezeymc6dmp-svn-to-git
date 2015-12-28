

$(window).load( function() {
     $(".sf-menu li").addClass("alt");
	          
    });

$(function(){

/* toggle nav */
	$("#menu-icon").on("click", function(){
		$(".sf-menu").slideToggle();
		$(this).toggleClass("active");
	});



 $('.soc  a').hover(
  function(){$(this).stop().animate({opacity:0.7},200)},
  function(){$(this).stop().animate({opacity:1}, 300)}
  ) 

 $('.list-1 li a').hover(
  function(){$(this).parent().stop().animate({backgroundPosition:' 8px 1px'}, 200)},
  function(){$(this).parent().stop().animate({backgroundPosition:' 0 1px'}, 250)}
  ) 


	$().UItoTop({ easingType: 'easeOutQuart' });


// IPad/IPhone
	var viewportmeta = document.querySelector && document.querySelector('meta[name="viewport"]'),
    ua = navigator.userAgent,
 
    gestureStart = function () {
        viewportmeta.content = "width=device-width, minimum-scale=0.25, maximum-scale=1.6";
    },
 
    scaleFix = function () {
      if (viewportmeta && /iPhone|iPad/.test(ua) && !/Opera Mini/.test(ua)) {
        viewportmeta.content = "width=device-width, minimum-scale=1.0, maximum-scale=1.0";
        document.addEventListener("gesturestart", gestureStart, false);
      }
    };
scaleFix();
// Menu Android
	var userag = navigator.userAgent.toLowerCase();
	var isAndroid = userag.indexOf("android") > -1; 
	if(isAndroid) {
		$('.sf-menu').responsiveMenu({autoArrows:true});
	}
});
