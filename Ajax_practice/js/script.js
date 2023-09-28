// (API_KEYには、"取得したAPIキー"　を記述)
const API_KEY = "fd9f51f8b666bbd2c985bc1e4323387a";

$(function(){
  $("#btn").on("click", function(){
    // 入力された都市名でWebAPIに天気情報をリクエスト
    $.ajax({
      url: https:api.openweathermap.org/data/2.5/weather?q=tokyo&units=metric&appid=fd9f51f8b666bbd2c985bc1e4323387a

    })
  });
});