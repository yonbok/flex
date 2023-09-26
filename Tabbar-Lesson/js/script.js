$("#tab-contents .tab[id != "tab1"]").hide();
// $()関数では、特定の属性を持つ要素や属性値を絞り込むことができる
// その場合　$("要素[属性]")　と記述する

$("#tab-menu a").on("click", function(event) {
  $("#tab-contents .tab").hide();
  $("#tab-menu .active").removeClass("active");
  // タブのクラスがactiveのときは背景色が白色・文字色が黒になるように設定している
  // タブの切り替えでこの設定も一旦削除しなければいけないから、removeClass()にactiveを指定
  $(this).addClass("active")
  $($(this).attr("href")).show();
  // attr()はhtml要素の属性を取得したり設定できるメソッド
  event.preventDefault();
});