// (API_KEYには、"取得したAPIキー"　を記述)
const API_KEY = "fd9f51f8b666bbd2c985bc1e4323387a";

$(function(){
  $("#btn").on("click", function(){
    // 入力された都市名でWebAPIに天気情報をリクエスト
    $.ajax({
      url: "https://api.openweathermap.org/data/2.5/weather?q=" + $('#cityname').val() + "&units=metric&appid=" + "fd9f51f8b666bbd2c985bc1e4323387a",
      dateType: "jsonp",
    }).done(function (data){
      // 通信成功
      // 位置
      $("#place").text(data.name);
      // 最高気温
      $("#temp_max").text(data.main.temp_max);
      // 最低気温
      $("#temp_min").text(data.main.temp_min);
      // 湿度
      $("#humidity").text(data.main.humidity);
      // 風速
      $("#speed").text(data.main.speed);
      // 天気
      $("#weather").text(data.weather[0].main);
      // 天気アイコン
      $("img").attr("src","http://openweathermap.org/img/w/" + data.weather[0].icon + ".png");
      $("img").attr("alt", data.weather[0].main);
    }).fail(function (data){
      //　通信失敗
      alert("通信に失敗しました。");
    });
  });
});
// $("#id名").text(JSONから欲しい値)の形で指定すると、指定したidのテキストを
// JSONから受け取った値に変換される。
// 今回の場合は"data.JSONのオブジェクト名.プロパティ名"で取得している
// さらに、$(要素名).attr(属性名,値);と指定すると、img要素に
// src属性とalt属性が追加される。