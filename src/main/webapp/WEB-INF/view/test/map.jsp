<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>基本地图展示</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script src="http://cache.amap.com/lbs/static/es5.min.js"></script>
    <script src="http://webapi.amap.com/maps?v=1.4.0&key=92afb20846ba29efcfe1a7458f59de79"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container"></div>

<script>
    var map = new AMap.Map('container', {
        resizeEnable: true,
        zoom:11,
        center: [116.40, 39.91]
    });
    
    AMap.service('AMap.Geocoder',function(){//回调函数
        //实例化Geocoder
        geocoder = new AMap.Geocoder({
            city: "010"//城市，默认：“全国”
        });
        //TODO: 使用geocoder 对象完成相关功能
      //逆地理编码
        var lnglatXY=[116.396574, 39.992706];//地图上所标点的坐标
        geocoder.getAddress(lnglatXY, function(status, result) {
            if (status === 'complete' && result.info === 'OK') {
               //获得了有效的地址信息:
               //即，result.regeocode.formattedAddress
               alert('地址:'+result.regeocode.formattedAddress);
            }else{
               //获取地址失败
            }
        });
    });

</script>
</body>
</html>