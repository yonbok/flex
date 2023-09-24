$(function(){
  $(".menu-trigger").on("click", function(event) {
    $(this).toggleClass("active");
    // トグル処理では、該当のclass属性がある場合にはclassが削除され、
    // ない場合にはclassが追加される
    $("#sp-menu").fadeToggle();
    //要素のフェードイン・フェードアウトを切り替えるメソッド
    event.preventDefault();
  });
});