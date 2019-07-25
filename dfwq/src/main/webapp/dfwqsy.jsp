<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> 
  <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8" lang="en"> 
  <![endif]-->
  <!--[if IE 8]> <html class="no-js lt-ie9" lang="en"> <![endif]-->
  <!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
  <head>
    <title>东方微趣</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="author" content="templatemo">
    <meta charset="UTF-8">

    <!-- CSS Bootstrap & Custom -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">  
    <link href="slider/flexslider.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="css/templatemo_style.css" rel="stylesheet" type="text/css">

    <!-- Modernizr -->
    <script src="slider/modernizr.js"></script>
    <!-- HTML 5 shim for IE backwards compatibility -->
  <!-- [if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
  </script>
  <![endif]-->
  
  <STYLE type=text/css>
  body
  {
      background-color:#eeeeee;
  }
   .style1 {
           FONT-SIZE: 12pt; COLOR: #ff0000
           }
   .style2 {
          FONT-SIZE: 10pt; COLOR: #0000ff
           }
           
   .center-vertical {
        position:relative;
        top:50%;
        transform:translateY(50%);
           }    
    .row-centered {
                text-align:center;
            }
            
     .col-centered {
                display:inline-block;
                float:none;
                text-align:center;
                margin-right:-4px;
            }

  </STYLE>
</head>
<body>

  <nav class="navbar navbar-default navbar-fixed-top" role="navigation">    
    <div class="container">
      <div class="row">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="col-md-2 col-sm-2 col-xs-12">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">切换导航</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand"><img src="images/templatemo_logo.png" alt="karma"></a>
          </div>
        </div>        
        
        <div class="col-md-10 col-sm-10 col-xs-12">
          <div class="navbar-collapse collapse menu">          
            <ul class="nav navbar-nav navbar-right">
              <li><a href="#home"><i class="fa fa-home"></i>首页</a></li>
              <li><a href="#contact"><i class="fa fa-user"></i>八字测算</a></li>
              <li><a href="#map"><i class="fa fa-cogs"></i>查看结果</a></li>
              <li><a href="#portfolio"><i class="fa fa-briefcase"></i>珠宝展示</a></li>
              <li><a href="#blog"><i class="fa fa-pencil"></i>特色</a></li>
              <li><a href="#contact"><i class="fa fa-envelope"></i>联系我们</a></li>
            </ul>
          </div><!-- /.navbar-collapse -->
        </div>
      </div><!-- /.row -->
    </div>
  </nav>

  <div class="container" id="home">
    <div class="row">
      <div class="col col-md-12">        
        <div class="flexslider">
          <ul class="slides">
            <li>
              <img src="images/imagestemplatemo_slide_1.jpg" alt="slide 1" />
              <p class="flex-caption">1</p>
            </li>
            <li>
              <img src="images/imagestemplatemo_slide_2.jpg" alt="slide 2" />
              <p class="flex-caption">2</p>
            </li>
            <li>
              <img src="images/imagestemplatemo_slide_3.jpg" alt="slide 3" />
              <p class="flex-caption">3</p>
            </li>
          </ul>
        </div>            
      </div>
    </div>
  </div>
  

  <section id="contact">
    <div class="outer_container">
      <div class="container">
        <div class="row">         
		  <div class="col col-md-5 col-sm-12" id="contact_content">
              <div class="row">                 
                    <img src="images/templatemo_image_02.jpg" alt="Linda" class="center-block img-circle img-responsive">                                               
              </div>
          </div>
              		 
          <div class="col col-md-7 col-sm-12 col-xs-12 center-row" id="contact_content">
            <form role="form" action="#" method="post" class="" id="birthinfo"  name=cal>
              <div class="row">               
				<div class="col-md-2">
                  <div class="form-group">
                    姓名:
                  </div>
                </div>
				
				<div class="col-md-3">
                  <div class="form-group">
                    <input name="fullname" type="text" class="form-control" id="input_name" placeholder="姓名...">
                  </div>
                </div>                
              </div>
			  <div class="row">
			    <div class="col-md-2">
                  <div class="form-group">
                    性别:
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="form-group">
                    <div class="form-control" for="ssex"> 
					  <input name="ssex" type="radio"  id="input_asex" value="男" checked="checked">男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  <input name="ssex" type="radio"  id="input_bsex" value="女">女
					</div>
                  </div>
                </div> 
              </div>
			  <div class="row">
			    <div class="col-md-2">
                  <div class="form-group">
                    出生日期:<br/>(公历)
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="form-group">
                    <select class="form-control" id="select_y" name=y>                      
					</select>
				  </div>
                </div>  
				<div class="col-md-1">
                  <div class="form-group">
                    年
                  </div>
                </div>
				<div class="col-md-2">
                  <div class="form-group">
                    <select class="form-control" id="select_m" name=y> 
                        <option value="1" selected>1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>				
					</select>
				  </div>
                </div>
				<div class="col-md-1">
                  <div class="form-group">
                    月
                  </div>
                </div>
				<div class="col-md-2">
                  <div class="form-group">
                    <select class="form-control" id="select_r" name=d>                      
					</select>
				  </div>
                </div>
				<div class="col-md-1">
                  <div class="form-group">
                    日
                  </div>
                </div>								
              </div>
			  <div class="row">
			    <div class="col-md-2">
                  <div class="form-group">
                    时间:
                  </div>
                </div>
                <div class="col-md-3">
                  <div class="form-group">
                    <select class="form-control" id="select_sh" name=h>  
                    <option value="1" selected>1[丑时]</option>
						<option value="2">2[丑时]</option>
						<option value="3">3[寅时]</option>
						<option value="4">4[寅时]</option>
						<option value="5">5[卯时]</option>
						<option value="6">6[卯时]</option>
						<option value="7">7[辰时]</option>
						<option value="8">8[辰时]</option>
						<option value="9">9[巳时]</option>
						<option value="10">10[巳时]</option>
						<option value="11">11[午时]</option>
						<option value="12">12[午时]</option>
						<option value="13">13[未时]</option>
						<option value="14">14[未时]</option>
						<option value="15">15[申时]</option>
						<option value="16">16[申时]</option>
						<option value="17">17[酉时]</option>
						<option value="18">18[酉时]</option>
						<option value="19">19[戌时]</option>
						<option value="20">20[戌时]</option>
						<option value="21">21[亥时]</option>
						<option value="22">22[亥时]</option>
						<option value="23">23[子时]</option>
						<option value="24">24[子时]</option>	
					</select>
				  </div>
                </div> 
				<div class="col-md-1">
                  <div class="form-group">
                    点
                  </div>
                </div> 				
              </div>
			  <div class="row">               
				<div class="col-md-2">
                  <div class="form-group">
                    手机号码:
                  </div>
                </div>
				
				<div class="col-md-3">
                  <div class="form-group">
                    <input name="pnonenum" type="text" class="form-control" id="phone_num" placeholder="手机号码...">
                  </div>
                </div>                
              </div>
			  <div class="row">
			      <div class="col-md-6 col-centered">
				      <div class="form-group">
				          <a class="btn btn-primary form-control" id="" onclick=inq(cal)>测&nbsp;&nbsp;&nbsp;&nbsp;算</a>
					  </div>
				  </div>
				  <div class="col-md-6 col-centered">  
					  <div class="form-group">
                         <a type="reset" class="btn btn-primary form-control" id="qx">取&nbsp;&nbsp;&nbsp;&nbsp;消</a>
					  </div>
                </div>
			  </div>
            </form>          
          </div>
        </div>
      </div>
    </div>
  </section>
   
<section id="map" style="display:none">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-4 col-md-push-8 col-sm-12">         
			   <img src="images/templatemo_image_02.jpg" alt="Linda" class="center-block img-circle img-responsive">                     
          </div>
          <div class="col col-md-8 col-md-pull-4 col-sm-12">            
              <div id='csjg'></div>          				
          </div>              
		</div>
		
		<div class="row">
          <div class="col col-md-8 col-sm-12">
          
           <div class="row">
			      <div class="col-md-4 col-centered">
				      <div class="form-group">
				          <input class="btn btn-primary form-control hidden-xs hidden-sm" name='print'  id='bt' onclick = "btonclick()" value='打印结果'/>
					  </div>
				  </div>
				  <div class="col-md-4 col-centered">  
					  <div class="form-group">
                         <input class="btn btn-primary form-control" name='fanhui'  id='fh' onclick = "fhonclick()" value='退&nbsp;&nbsp;&nbsp;&nbsp;出'/>
					  </div>
                </div>
			  </div>
          </div>
          <div class="col col-md-4  col-sm-12">
          </div>              
		</div>		
	</div>	
  </div>	   
  </section>
    
 
  
  <footer>
    <div class="container">        
      <div class="row">
      <div class="col col-centered col-md-12 col-sm-12 col-xs-12 col-xxs ">
          <div>
           <img src="images/templatemo_logo.png" alt="karma">
           <div id="templatemo_copyright">
            版权所有 © 2020 <a href="#">和发黄金</a> <a href="#" >返回顶部</a>
           </div>
           </div>
        </div> 
        
      </div> 
    </div>
  </footer>

  <!-- JavaScripts --> 
  <script src="js/jquery.min.js"></script>
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <script src="js/jquery.singlePageNav.js"></script>
  <script src="js/templatemo_custom.js"></script>
  <script src="js/dfwqsy.js"></script>
  <script defer src="slider/jquery.flexslider.js"></script>
   
</body>
</html>