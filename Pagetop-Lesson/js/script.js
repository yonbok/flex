$(function(){
  $("#back a").on("click", function(event){
    // 上の引数で使われているeventは省略も可能　例：function(e)
    // 以下は#back内のaタグがクリックされたときの処理
    $("body, html").animate({
      scrollTop:0 //変化対象のプロパティ名：変化値
      //上の記述は「最上部に移動する」の意味
    }, 800);  //アニメーションの動作時間
    //上の記述は800ミリ秒間(0.8秒間)かけてページの最上部まで移動する」の意味
    //ミリ秒指定以外にもshow,normal,fastで指定することも可能
    event.preventDefault(); //aタグ機能を無効にするメソッド
  });
});