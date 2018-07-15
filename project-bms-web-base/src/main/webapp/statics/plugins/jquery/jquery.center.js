(function ($)
{
	$.fn.center = function (settings)
	{
		var style = $.extend(
		{
			position: 'absolute', //absolute or fixed
			top     : '50%',
			left    : '50%',
			zIndex  : 2000,
			relative: true
		}, settings || {});

    return this.each(function ()
	{
		var $this = $(this);

		if (style.top == '50%')
			style.marginTop = -$this.outerHeight() / 2;
      
		if (style.left == '50%')
			style.marginLeft = -$this.outerWidth() / 2;
      
		if (style.relative && !$this.parent().is('body') && $this.parent().css('position') == 'static')
			$this.parent().css('position', 'relative');

		delete style.relative;


		$this.css(style);
    });
  };
})(jQuery);