$(window).load(function(){
      $('.flexslider').flexslider({
        animation: "slide",
        start: function(slider){
          $('body').removeClass('loading');
          $('.menu').singlePageNav();
        }
      });
    });

    $('#go-top').click(function(event) {
      event.preventDefault();
      jQuery('html, body').animate({scrollTop: 0}, 1000);
      return false;
    });
	
	$('#xsh').click(function(){
	    var firstname = $('#input_name').val();
		var item = $('input[name=ssex][checked]').val();
		alert('okok' + firstname + '性别'+ item);   
	});
	
	$('#qx').click(function(){
	    $('#birthinfo')[0].reset();  
	});
	
	//var a = request.getAttribute("username");
	//var a = '<%=Session["userinfo"]%>';
	//console.log("输出用户名:" );
	
	//$.get('http://localhost:8080/dfwq/wx.shtml', function(data){
	    //alert(data);
	    //});	
		
    var mydate = new Date();
	var curryear = mydate.getFullYear();
	for(var i=1901; i<=2050; i++)
	   {
	   //if(i==curryear)
	  if(i==1988)
	     $("#select_y").append("<option value=" + "'" + i + "' selected='true'>" + i + "</option>");
	   else
	     $("#select_y").append("<option value=" + "'" + i + "'>" + i + "</option>");
	   }
	   
	 for(var i=1; i<=31; i++)
	   {
	     $("#select_r").append("<option value=" + "'" + i + "'>" + i + "</option>");
	 }

	    
	    
//<!--
tg=new Array("甲","乙","丙","丁","戊","己","庚","辛","壬","癸");
dz=new Array("子","丑","寅","卯","辰","巳","午","未","申","酉","戌","亥");
sx=new Array("鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪");
w=new Array("木","火","土","金","水");
f=new Array("东","南","中","西","北");
sz=new Array("一","二","三","四","五","六","七","八","九","十",
			"十一","十二","十三","十四","十五","十六","十七","十八","十九","二十",
			"廿一","廿二","廿三","廿四","廿五","廿六","廿七","廿八","廿九","三十");
m0=new Array(
0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,
0,1,0,1,2,1,0,0,1,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,
1,1,0,1,1,0,0,1,0,1,0,1,0,1,1,3,0,1,0,1,0,1,0,1,
0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,1,1,0,1,0,1,1,0,1,
0,4,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,3632)
m1=new Array(
1,0,1,0,0,4,0,1,1,0,1,1,1,0,1,0,0,1,0,0,1,1,0,1,
1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,3,0,1,0,0,1,0,1,
1,0,1,1,0,1,0,1,0,1,0,0,1,1,0,1,0,1,1,0,1,0,1,0,
1,2,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,
0,1,0,0,1,0,3,1,0,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,7294)
m2=new Array(
1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,2,1,0,0,1,0,1,1,
0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,0,1,0,1,0,0,
1,0,1,3,1,0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,0,
1,0,0,1,0,1,0,1,0,1,1,1,0,4,0,1,0,0,1,0,1,1,1,1,
0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,4,0,1,0,1,1,0,10955);
m3=new Array(
1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,
0,1,1,0,5,0,1,0,1,0,0,1,0,1,0,1,1,0,1,0,1,1,0,1,
0,0,1,0,1,0,1,1,0,1,1,0,1,0,3,0,0,1,1,0,1,1,1,0,
1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,3,0,1,1,0,1,
1,1,0,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,14587);
m4=new Array(
1,1,0,1,1,3,0,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,
0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,3,0,1,0,1,1,0,1,1,
0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,0,1,
1,4,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,
1,0,1,1,0,1,2,1,0,1,0,1,0,1,1,0,1,1,0,0,1,0,1,0,18249);
m5=new Array(
1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,3,0,1,1,0,1,0,1,
0,1,0,0,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,
0,1,3,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,
1,0,1,0,1,0,0,4,1,0,1,0,1,1,1,0,1,0,0,1,0,1,0,1,
0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,4,1,0,1,0,1,0,21911);
m6=new Array(
1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,
1,0,1,2,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,
0,1,0,1,0,0,1,0,0,1,1,0,1,1,4,1,0,0,1,0,0,1,1,0,
1,1,0,1,1,0,0,1,0,1,0,1,0,1,0,1,1,0,4,1,0,1,0,1,
0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,25544);
m7=new Array(
0,1,0,0,4,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,
1,0,1,0,0,1,0,0,1,1,0,1,1,1,0,4,0,1,0,0,1,1,0,1,
1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,4,0,1,0,1,
1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,
1,0,0,1,0,5,0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,29206);
m8=new Array(
0,1,0,0,1,0,0,1,1,0,1,1,1,0,1,2,1,0,0,1,0,1,1,1,
1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,4,1,1,
0,1,1,0,1,0,1,0,0,1,0,1,0,1,1,0,1,1,0,1,0,1,0,0,
1,0,1,0,1,4,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,0,
1,0,0,1,0,1,0,1,0,1,1,1,0,1,0,0,4,0,1,0,1,1,1,1,32868);
m9=new Array(
0,1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,
0,1,4,1,0,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,
0,1,1,0,1,0,1,4,0,1,0,1,0,1,0,1,1,0,1,0,1,1,0,0,
1,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,2,1,1,0,1,1,0,1,
1,0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,0,36499);
m10=new Array(
1,1,0,4,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,
1,1,0,1,1,0,1,0,0,1,0,1,0,4,1,1,0,1,0,1,0,1,0,1,
0,1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,4,1,1,0,1,1,
0,0,1,0,0,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,1,0,1,
1,1,0,0,4,0,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,40161);
m11=new Array(
1,0,1,1,0,1,0,0,1,0,1,0,1,0,1,4,1,0,1,0,1,0,1,0,
1,0,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,4,1,0,1,
0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,
0,1,0,1,0,3,0,1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,
1,0,1,0,1,0,0,1,0,0,1,1,0,1,1,4,1,0,0,1,0,1,0,1,43823);
m12=new Array(
0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,
0,4,0,1,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,
1,0,1,0,0,4,1,0,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,0,
1,1,0,1,0,0,1,0,0,1,1,0,1,1,1,0,4,0,1,0,0,1,1,0,
1,1,0,1,0,1,0,1,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,0,47455)
m13=new Array(
0,1,4,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,
0,1,0,0,1,0,1,0,1,1,4,1,0,1,0,0,1,0,1,0,1,1,0,1,
1,0,1,0,0,1,0,0,1,1,0,1,1,1,0,1,0,3,0,0,1,0,1,1,
1,1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,0,
1,1,0,1,4,1,0,1,0,1,0,0,1,0,1,1,0,1,0,1,1,0,1,0,51117)
m14=new Array(
0,1,0,1,0,1,1,0,1,1,0,1,0,4,0,1,0,1,0,1,1,0,1,1,
0,1,0,0,1,0,0,1,1,0,1,1,1,0,1,0,0,1,2,1,0,1,1,1,
1,0,1,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,1,0,0,1,0,1,
1,0,1,1,3,0,1,0,0,1,0,1,0,1,1,0,1,1,0,1,0,0,1,0,
1,0,1,0,1,1,0,1,1,0,1,0,0,1,3,0,1,0,1,1,0,1,1,0,54779)
ms=new Array(m0,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14);
ly=new Array(29,30,58,59,59,60);
tw=new Array(0,0,1,1,2,2,3,3,4,4);
dw=new Array(4,2,0,0,2,1,1,2,3,3,2,4);

function inq(form){
re="请重新输入！";

var customername = $("#input_name").val();
var customersex = $("input[name='ssex']:checked").val();
var customerphone = $("#phone_num").val();
var customerbirth = $("#select_y option:selected").val() + "年" + $("#select_m option:selected").val() + "月" + $("#select_r option:selected").val() + "日" + $("#select_sh option:selected").val() + "时"; 
if (customername == null || customername.length==0)
    { 
	  alert("请输入姓名！");
	  return;
    }
else if(customerphone == null || customerphone.length == 0)
	{
	  alert("请输入手机号码！");
	  return;
	}
else if(!(/^1(3|4|5|7|8)\d{9}$/.test(customerphone)))
    { 
        alert("手机号码有误，请重填!");  
        return ;
     };
console.log("顾客姓名："+ customername);
console.log("顾客性别："+ customersex);
console.log("顾客电话："+ customerphone);
console.log("顾客出生日期："+ customerbirth);

//y=form.y.value;
y = $('#select_y option:selected').val();
console.log("y的值is：" + y);
if(y==""||y<1901||y>2050)
  alert("年应在1901和2050之间。"+re);
else{
  gl0=(Date.UTC(y,0,1)-Date.UTC(1901,1,19))/86400000;
  dy=y-1901;
  i=Math.floor(dy/10);
  console.log("i的值为：" + i);
  nl0=(i==0)?0:ms[i-1][120];
  n=i*120;for(j=0;j<120;j++){
    n++;if(n>dy*12)break;
	nl0+=ly[ms[i][j]];
	}
cjr=(nl0-gl0)%31+1;
cjy=(nl0-gl0>30)?2:1;
jq=tg[(dy+6)%10]+dz[dy%12];
jh=tg[(dy+7)%10]+dz[(dy+1)%12];
s1="<table><tr><td><font size=4>您的测算结果如下:<p>公历："+y+"年";
s2="<br>春节："+cjy+"月"+cjr+"日<br>节前："+jq+"年<br>节后："+jh+"年<br>";
s3="要查询生辰八字，请输入时。";
s4="</font></td></tr></table>";
m=$('#select_m option:selected').val();
d=$('#select_r option:selected').val();
h=$('#select_sh option:selected').val();
if(m==""||d==""){
  document.write(s1,s2,"<br>","进一步查询，请输入月和日。<br>",s3,s4);
  document.close();}
else if(m>12||m<1)
  alert("月应在1与12之间。"+re);
else if(d>31||d<1)
  alert("日应在1与31之间。"+re);
else if((m==4||m==6||m==9||m==11)&&d>30)
  alert(m+"月只有30天。"+re);
else if(y%4!=0&&m==2&&d>28)
  alert(y+"年是平年，2月只有28天。"+re);
else if(m==2&&d>29)
  alert(y+"年是闰年，2月只有29天。"+re);
else if(h>23||h<0)
  alert("时应在0与23之间。"+re);
else{
  if($('#select_sh option:selected').val()=="")
    h=0;
  sum=(Date.UTC(y,m-1,d,h)-Date.UTC(1901,1,18,23))/1000;
  sumd=Math.floor(sum/86400);
  day=(Math.floor((sum-1800)/86400)+51)%7;
  xq=(day==0)?"日":sz[day-1];
  tgr=(sumd+54)%10;
  dzr=(sumd+52)%12;
  gzr=tg[tgr]+dz[dzr];
  dzs=Math.floor((h*1+1)/2)%12;
  tgs=((tgr%5)*2+dzs)%10;
  gzs=tg[tgs]+dz[dzs];
  for(i=0;ms[i][120]<=sumd;i++);
  k=(i==0)?0:ms[i-1][120];
  p=i*120;
  for(j=0;j<120;j++){
    k+=ly[ms[i][j]];
	p++;
	if(k>sumd)break;}
 if(sumd+30<0){
   ri=59+sumd;
   p=-1;}
 else if(sumd<0){
   ri=30+sumd;p=0;}
 else
  ri=sumd+ly[ms[i][j]]-k;
  yue=((p+11)%12==0)?"正":sz[(p+11)%12];
  mij=ms[i][j];
  if((mij==2||mij==3)&&ri>28){
    ri-=29;yue="闰"+yue;}
  else if((mij==4||mij==5)&&ri>29){
    ri-=30;yue="闰"+yue;}
  ri=((ri<10)?"初":"")+sz[ri];
  tgn=Math.floor((p-1)/12+7)%10;
  dzn=Math.floor((p-1)/12+1)%12;
  gzn=tg[tgn]+dz[dzn];
  tgy=(p+5)%10;
  dzy=(p+1)%12;
  gzy=tg[tgy]+dz[dzy];
  tn=tw[tgn];
  dn=dw[dzn];
  ty=tw[tgy];
  dy=dw[dzy];
  tr=tw[tgr];
  dr=dw[dzr];
  ts=tw[tgs];
  ds=dw[dzs];
  s5=m+"月"+d+"日（星期"+xq+"）";
  s6="<br>农历："+gzn+"年"+yue+"月"+ri+"日";
  s7="生肖："+sx[dzn]+"<p>"

var whjin=0;
var whmu=0;
var whshui=0;
var whhuo=0;
var whtu=0;
switch (w[tn]) {
	case "金":
    	whjin += 1;
    	break;
	case "木":
    	whmu += 1;
    	break;
	case "水":
    	whshui += 1;
    	break;
	case "火":
    	whhuo += 1;
    	break;
	case "土":
    	whtu += 1;
    	break;
	default:    
}
switch (w[dn]) {
case "金":
	whjin += 1;
	break;
case "木":
	whmu += 1;
	break;
case "水":
	whshui += 1;
	break;
case "火":
	whhuo += 1;
	break;
case "土":
	whtu += 1;
	break;
default:    
}
switch (w[ty]) {
case "金":
	whjin += 1;
	break;
case "木":
	whmu += 1;
	break;
case "水":
	whshui += 1;
	break;
case "火":
	whhuo += 1;
	break;
case "土":
	whtu += 1;
	break;
default:    
}
switch (w[dy]) {
	case "金":
		whjin += 1;
		break;
	case "木":
		whmu += 1;
		break;
	case "水":
		whshui += 1;
		break;
	case "火":
		whhuo += 1;
		break;
	case "土":
		whtu += 1;
		break;
	default:    
}
switch (w[tr]) {
	case "金":
		whjin += 1;
		break;
	case "木":
		whmu += 1;
		break;
	case "水":
		whshui += 1;
		break;
	case "火":
		whhuo += 1;
		break;
	case "土":
		whtu += 1;
		break;
	default:    
}
switch (w[dr]) {
	case "金":
		whjin += 1;
		break;
	case "木":
		whmu += 1;
		break;
	case "水":
		whshui += 1;
		break;
	case "火":
		whhuo += 1;
		break;
	case "土":
		whtu += 1;
		break;
	default:    
}
switch (w[ts]) {
	case "金":
		whjin += 1;
		break;
	case "木":
		whmu += 1;
		break;
	case "水":
		whshui += 1;
		break;
	case "火":
		whhuo += 1;
		break;
	case "土":
		whtu += 1;
		break;
	default:    
}
switch (w[ds]) {
	case "金":
		whjin += 1;
		break;
	case "木":
		whmu += 1;
		break;
	case "水":
		whshui += 1;
		break;
	case "火":
		whhuo += 1;
		break;
	case "土":
		whtu += 1;
	break;
	default:    
}
$("#jin").val(whjin);
$("#mu").val(whmu);
$("#shui").val(whshui);
$("#huo").val(whhuo);
$("#tu").val(whtu);

var whtongji = whjin+"金; " + whmu + "木; " + whshui + "水; " + whhuo + "火; " + whtu +  "土";

var witem = "";
var qitem = "";
if(whjin >= 3)
	witem += " 金 ";
else if(whmu >= 3)
	witem += " 木 ";
else if(whshui >= 3)
	witem += " 水 ";
else if(whhuo >= 3)
	witem += " 火 ";
else if(whtu >= 3)
	witem += " 土 " ;
if(witem != "" || witem != null || witem != undefined)
   wlastitem = witem + "旺" + "<br>";
else
   wlastitem = "";

if(whjin == 0)
	qitem += " 金 ";
else if(whmu == 0)
	qitem += " 木 ";
else if(whshui == 0)
	qitem += " 水 ";
else if(whhuo == 0)
	qitem += " 火 ";
else if(whtu == 0)
	qitem += " 土 " ;

if(qitem != "" || qitem != null || qitem != undefined)
	qlastitem = "缺" + qitem + "<br>";
else
	qlastitem = "";

var pathName = window.location.pathname.substring(1);  
var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));  
console.log( "路径：" + window.location.protocol + '//' + window.location.host + '/'+ webName); 

console.log("查询ajax开始...");
/*
var tj = $.ajax( {    
	//url:'http://localhost:8080/dfwq/gk/addcustomer.shtml',// 跳转到 action    
	url: window.location.protocol + '//' + window.location.host + '/'+ webName +'/customer/getjewelry.shtml',
	//data:gk_XM = "zhangsan",    
	type:'get',    
	cache:false, 
	contentType: "application/json",
	dataType:'json',	
	success:function(data) {    
    	//if(data.msg == "success" ){    
        	// view("修改成功！");    
        	//alert("添加成功！");    
        	//window.location.reload();
		    console.log("查询结果如下:" + data);
    		//console.table(data);
    	//}else{    
    		//alert("添加失败！"+ data);    
    	//}    
 	},    
 	error : function() {    
      	// view("异常！");    
      	alert("异常！");    
 	}    
});
*/
var tjcp="<br>" + "推荐饰品:";
var tj=$.ajax({
    url:window.location.protocol + '//' + window.location.host + '/'+ webName +'/cp/getjewelry.shtml?cplb=' + encodeURI(encodeURI(qitem)),
    type: "get",
    contentType: "application/json",
    dataType:"json",
    async : false,
    success: function (returnValue) {
        //$("#cId").val(returnValue);
    	console.log("已访问到！" + returnValue);
    	for(var k=0;k<returnValue.length;k++)
    		{
    		//console.log(returnValue[k].cp_mc);
    		tjcp = tjcp + "<br>&nbsp;&nbsp;&nbsp;&nbsp" + returnValue[k].cp_mc;
    		console.log("tjcp" + tjcp);
    		}
    	//console.log(returnValue[0].gk_XM);
    },
    error: function (returnValue) {
        alert("对不起！");
    }
});
console.log("查询ajax结束...");

var gukeshx = sx[dzn];
var tjbmf="<br>" + "本命佛:";
console.log("sx is:" + gukeshx);
console.log("ajax bmf begin...");
var tjb=$.ajax({
    url:window.location.protocol + '//' + window.location.host + '/'+ webName +'/bmf/getbmf.shtml?gksx=' + encodeURI(encodeURI(gukeshx)),
    type: "get",
    contentType: "application/json",
    dataType:"json",
    async : false,
    success: function (returnValue) {
        //$("#cId").val(returnValue);
    	console.log("已访问到！" + returnValue);
    	for(var k=0;k<returnValue.length;k++)
    		{
    		//console.log(returnValue[k].cp_mc);
    		tjbmf = tjbmf + "<br>&nbsp;&nbsp;&nbsp;&nbsp" + returnValue[k].bmf_bmf;
    		console.log("tjbmf" + tjbmf);
    		}
    	//console.log(returnValue[0].gk_XM);
    },
    error: function (returnValue) {
        alert("对不起！");
    }
});
console.log("ajax bmf over...");

var tjjshou="<br>" + "吉兽:";
console.log("ajax jishou begin...");
var tjc=$.ajax({
    url:window.location.protocol + '//' + window.location.host + '/'+ webName +'/jsb/getjs.shtml?gksx=' + encodeURI(encodeURI(gukeshx)),
    type: "get",
    contentType: "application/json",
    dataType:"json",
    async : false,
    success: function (returnValue) {
        //$("#cId").val(returnValue);
    	console.log("已访问到！" + returnValue);
    	for(var k=0;k<returnValue.length;k++)
    		{
    		//console.log(returnValue[k].cp_mc);
    		tjjshou = tjjshou + "<br>&nbsp;&nbsp;&nbsp;&nbsp" + returnValue[k].jsb_js;
    		console.log("tjjshou" + tjjshou);
    		}
    	//console.log(returnValue[0].gk_XM);
    },
    error: function (returnValue) {
        alert("对不起！");
    }
});
console.log("ajax jishou over...");

document.getElementById("map").style.display="block";//显示结果section

if($('#select_sh option:selected').val()=="")
	  //document.write(s1,s5,s6,s2,"干支：",gzn,"年",gzy,"月",gzr,"日<br>",s7,s3,s4);
	$('#csjg').html(s1+s5+s6+s2+"干支："+gzn+"年"+gzy+"月"+gzr+"日<br>"+s7+s3+s4);
else
	  //document.write(s1,s5,h,"点",s6,dz[dzs],"时",s2,
	  //"八字：",gzn,"　",gzy,"　",gzr,"　",gzs,"<br>",
	  //"五行：",w[tn],w[dn],"　",w[ty],w[dy],"　",w[tr],w[dr],"　",w[ts],w[ds],"<br>",
	  //"方位：",f[tn],f[dn],"　",f[ty],f[dy],"　",f[tr],f[dr],"　",f[ts],f[ds],"<br>",s7,s4,"<br>",whtongji);  
	  //document.close();
	  $('#csjg').html(s1+s5+h+"点"+s6+dz[dzs]+"时"+"<br>"+
			  "八字："+gzn+"　"+gzy+"　"+gzr+"　"+gzs+"<br>"+
			  //s7+"<br>"+whtongji+"<br>" + witem + qitem  +s4+"<br>");
			  s7+"<br>" + wlastitem + qlastitem + tjcp + tjbmf + tjjshou + s4+"<br>");
	/*var customer = {
			"id":"1",
			"gkwx_WXMCh" : "v1234",    
			"gkwx_OpenId" : "ASD123456ff",    
			"gk_XM" : "张三",    
			"gk_XB" : "男",
			"gk_SJHM" : "13066668888",
			"gk_glcs" : "1995-09-08 12:35:00"		
	};*/
    
    window.location.href = "#map";
    var customerNLbirth=gzn+"年"+yue+"月"+ri+"日"+dz[dzs]+"时"; 
    console.log("customerNLbirth:" + customerNLbirth);
    console.log("ajax begin!");  
  
	var aj = $.ajax( {    
	//url:'http://localhost:8080/dfwq/gk/addcustomer.shtml',// 跳转到 action    
		url: window.location.protocol + '//' + window.location.host + '/'+ webName +'/gk/addcustomer.shtml',
		data:JSON.stringify({		
		//"gkwx_WXMCh" : "v1234", 
		    
		"gk_XM" : customername,    
		"gk_SJHM" : customerphone,
		"gk_glcs" : customerbirth,
		"gk_nlcs" : customerNLbirth,
		"gk_WXMCh" : "v1234",
		"gk_OpenId" : "ASD123456ff",
		"gk_XB" : customersex
         }),    
	type:'post',    
	cache:false, 
	contentType: "application/json",
	dataType:'json',	
	success:function(data) {    
    	if(data.msg == "success" ){    
        	// view("修改成功！");    
        	//alert("添加成功！");    
        	//window.location.reload();    
    	}else{    
    		//alert("添加失败！"+ data);    
    	}    
 	},    
 	error : function() {    
      	// view("异常！");    
      	alert("异常！");    
 	}    
});
	  console.log("ajax over!");
}}}

var k = 0;
var str= '';
str += "<table class='table' border='1' bordercolor='#000'>";
for(var i=0; i<4; i++) {
    str += '<tr>';
    for(var j=0; j<5; j++) {
        var tds = '<td>' + data[k] + '</td>';
        k++;
        str += tds;
    }
    str += '</tr>';
}
str += '</table>';
$('#divId').html(str);

//打印结果
function printdiv(printpage) 
{ 
	var newstr = printpage.innerHTML; 
	var oldstr = document.body.innerHTML;
	document.body.innerHTML =newstr; 
	window.print(); 
	document.body.innerHTML=oldstr; 
	return false; 
} 

function btonclick()
{
	var bt=document.getElementById("bt");
	var div_print=document.getElementById("csjg");
	var div_content = document.getElementById("csjg").innerHTML;
	if(div_content==null || div_content.length == 0)
		return;	
	else if(div_content.trim()=="" || div_content==null){ //火狐要加trim
		return;
	};

		console.log("开始打印。。。");
		printdiv(div_print);
		console.log("打印结束。");
	
}

function fhonclick(){
	window.location.reload();	
}

//根据指定的id显示相应的<section>，同时隐藏其他部分（showSection函数）
function showSection(id) {  
    var sections=document.getElementsByTagName("section");  
    for(var i=0;i<sections.length;i++){  
        if(sections[i].getAttribute("id")!=id){  
            sections[i].style.display="none";  
        }else{  
            sections[i].style.display="block";  
        }  
    }  
}  

//在<article>中的<nav>所包含的链接被单击事调用showSection函数  
function prepareInternalnav() {  
    if(!document.getElementsByTagName) return false;  
    if(!document.getElementById) return false;  
    var articles=document.getElementsByTagName("article");  
    if(articles.length==0) return false;  
    var navs=articles[0].getElementsByTagName("nav");  
    if(navs.length==0) return false;  
    var nav=navs[0];   //？  
    var links=nav.getElementsByTagName("a");  
    for(var i=0;i<links.length;i++){  
        /* 
        split方法：提取每一部分的id值 
        这里，想要的是“#”后面的字符串，因此可以以“#”为分隔符，得到的数组中包含两个元素：第一个是“#”前面的所有字符（在此是空字符串），第二个元素则是后面的所有字符。数组中第一个元素的索引是0，我们想要的是第二个元素，它的索引是1。 
        这样就可以把“#”后面的字符串提取出来并保存到sectionId变量中。 
         */  
        var sectionId=links[i].getAttribute("href").split("#")[1];  
        //确保真的存在带有相应id的元素，如果不存在，则继续下一次循坏  
        if(!document.getElementById(sectionId)) continue;  
        //页面加载后，需要默认隐藏所有部分  
        document.getElementById(sectionId).style.display="none";  
        /* 
        接下来可以给链接添加onclik事件处理函数，以便链接被单击后，把sectionId传给showSection函数。但这里存在作用域问题，因为变量sectionId是一个局部变量，它只有在prepareInternalnav执行期间存在，等到事件处理函数执行的时候它就不存在了。 
        要解决这个问题，可以为每个链接创建一个自定义的属性。比如把这个属性命名为destination，然后把sectionId的值赋给它。 
        这个属性的作用域是持久存在的。 
         */  
        links[i].destination=sectionId;  
        links[i].onclick=function () {  
            showSection(this.destination);  
            return false;  
        }  
    }  
}  


