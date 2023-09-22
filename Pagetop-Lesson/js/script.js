$(function(){
  $("#back a").on("click", function(event){
    // 上の引数で使われているeventは省略も可能　例：function(e)
    // 以下は#back内のaタグがクリックされたときの処理
    $("body, html").animate({
      scrollTop:0
    }, 800);
    event.preventDefault();
  });
});