



function loadDataFromServer() {

    $.ajax({
        type: "GET",//请求方式
        url: window.abs_path + 'getHomePageData',//地址，就是json文件的请求路径
        dataType: "json",//数据类型可以为 text xml json  script  jsonp
        success: function(result){//返回的参数就是 action里面所有的有get和set方法的参数
            processHomePageData(result);
        }
    });

}


function processHomePageData(result) {



}

