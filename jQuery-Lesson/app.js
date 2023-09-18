// 正方形をクリックしたときに、その正方形のみslideUpする
$(function(){
    $(".bg1").on("click", function(){
        $(".bg1").slideUp();
    });

    $(".bg2").on("click", function(){
        $(".bg2").slideUp();
    });

    $(".bg3").on("click", function() {
        $(".bg3").slideUp();
    });

    (".bg4").on("click", function(){
        $(".bg4").slideUp();
    });
});



// マウスクリックイベントの設定
// $(function(){
//   $(".box1").on("click", function(){
//     $(".box1").addClass("box1-ext");
//   });
//   $(".box1").mouseout(function(){
//     $(".box1").removeClass("box1-ext");
//   });
// });


// クラス属性の追加・削除
// なぜ引数のbox1-extに.がいらないのか？
// $(function(){
//   $(".box1").mouseover(function(){
//     $(".box1").addClass("box1-ext");
//   });
//   $(".box1").mouseout(function(){
//     $(".box1").removeClass("box1-ext");
//   });
// });


// イベントの検出
// $(function(){
//   $(".box1").mouseover(function(){
//     $(".box1").css({"background-color": "#0000FF"});
//   });
//   $(".box1").mouseout(function(){
//     $(".box1").css({"background-color": "#FF0000"});
//   });
// });



// 赤色の正方形を青色の正方形に変更
// $(function(){
//   $(".box1").slideDown(function (){
//     $(".box1").css({
//       "background-color": "#0000FF",
//       "width": "200px",
//       "height": "100px"
//     }).slideUp();
//   });
// });


// 表示されてる要素を非表示
// $(function(){
//   $(".box1").hide();
// });


// 非表示の要素を表示
// $(function(){
//   $(".box1").show();
//   $(".box1").css({"background-color": "#0000FF"});
// });


// 下から上にスライド
// $(function(){
//   $(".box1").slideUp();
// });


// 上から下にスライド
// $(function(){
//   $(".box1").slideDown();
// });


// boxを表示させる
// $(function(){
//   $(".box1").css({
//     "background-color": "#0000FF",
//     "height": "100px"
//   });
// });



// $(document).ready(function () {
//   $("body").html("<h1>Hello jQuery!!</h1>");
// });


// 省略形
// $(function(){
  // jQueryプログラムの内容
// });
