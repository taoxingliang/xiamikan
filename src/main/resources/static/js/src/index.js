



function loadDataFromServer() {

    debugger;
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
    debugger;
    $.each(result,function(i,item){

        var html = "<div class=\"content_bottom\">\n" +
            "\t\t\t\t\t\t<div class=\"heading\">\n" +
            "\t\t\t\t\t\t\t<h3>" + item.categoryName + "<a style='float:right' href=\"" + window.abs_path + "getCategory/" + item.category  + "\"" + ">更多</a></h3>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t<div class=\"section group\">\n" +
            "\t\t\t\t\t\t<div class=\"grid_1_of_5 images_1_of_5\">\n" +
            "\t\t\t\t\t\t\t<a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id1 + "\"><img src=\"" + item.posterUrl1 + "\" alt=\"\" /></a>\n" +
            "\t\t\t\t\t\t\t<h2><a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id1 + "\">" + item.name1 + "</a></h2>\n" +
            "\t\t\t\t\t\t\t<div class=\"price-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"price-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"rupees\">" + item.doubanScore1 + "</span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div class=\"area-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"area-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"areas\"></span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t<div class=\"grid_1_of_5 images_1_of_5\">\n" +
            "\t\t\t\t\t\t\t<a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id2 + "\"><img src=\"" + item.posterUrl2 + "\" alt=\"\" /></a>\n" +
            "\t\t\t\t\t\t\t<h2><a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id2 + "\">" + item.name2 + "</a></h2>\n" +
            "\t\t\t\t\t\t\t<div class=\"price-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"price-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"rupees\">" + item.doubanScore2 + "</span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div class=\"area-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"area-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"areas\"></span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t<div class=\"grid_1_of_5 images_1_of_5\">\n" +
            "\t\t\t\t\t\t\t<a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id3 + "\"><img src=\"" + item.posterUrl3 + "\" alt=\"\" /></a>\n" +
            "\t\t\t\t\t\t\t<h2><a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id3 + "\">" + item.name3 + "</a></h2>\n" +
            "\t\t\t\t\t\t\t<div class=\"price-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"price-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"rupees\">" + item.doubanScore3 + "</span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div class=\"area-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"area-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"areas\"></span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t<div class=\"grid_1_of_5 images_1_of_5\">\n" +
            "\t\t\t\t\t\t\t<a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id4 + "\"><img src=\"" + item.posterUrl4 + "\" alt=\"\" /></a>\n" +
            "\t\t\t\t\t\t\t<h2><a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id4 + "\">" + item.name4 + "</a></h2>\n" +
            "\t\t\t\t\t\t\t<div class=\"price-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"price-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"rupees\">" + item.doubanScore4 + "</span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div class=\"area-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"area-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"areas\"></span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t<div class=\"grid_1_of_5 images_1_of_5\">\n" +
            "\t\t\t\t\t\t\t<a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id5 + "\"><img src=\"" + item.posterUrl5 + "\" alt=\"\" /></a>\n" +
            "\t\t\t\t\t\t\t<h2><a href=\"" + window.abs_path + "getDetail/" + item.category + "/" + item.id5 + "\">" + item.name5 + "</a></h2>\n" +
            "\t\t\t\t\t\t\t<div class=\"price-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"price-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"rupees\">" + item.doubanScore5 + "</span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t<div class=\"area-details\">\n" +
            "\t\t\t\t\t\t\t\t<div class=\"area-number\">\n" +
            "\t\t\t\t\t\t\t\t\t<p><span class=\"areas\"></span></p>\n" +
            "\t\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t\t</div>\n" +
            "\t\t\t\t\t</div>";

        $("#page_content_data").append("<li id=li"+i+">"+html+"</li>");
        $("#header_categories").append("<li><a href=\"" + window.abs_path + "getCategory/" + item.category + "\"" + ">" +item.categoryName + "</a></li>");

    });
}



