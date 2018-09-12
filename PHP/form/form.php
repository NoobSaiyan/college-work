<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <title>FORM</title>
    
    <style>
        
        *{margin: 0px; padding: 0px;}
        body{background-color: rebeccapurple;}
        input{height: 30px; border: 0px; background-color:#d3d6d4; font-size: 17px; width: 300px; padding-left: 5px;padding-right: 5px;}
        input[type=file]{padding:2px; font-size: 13px; height: 25px; width: 220px;}
        input[type=radio]{width: 15px;}
        input[type=checkbox]{width: 15px;}        
        .form-box{width: 750px; height: 980px; margin:auto; background-color: whitesmoke; box-shadow: 0px 0px 50px 5px black; margin-top: 50px; border-radius: 12px; margin-bottom:50px;}
        .logo-form{  height: 100px; margin-left:190px; margin-top: 40px; }
        .form-name{float: right;margin-right:190px; font-size: 80px;font-family: Bahnschrift SemiBold; font-weight:900; margin-top: 62px; color:#2e7d32 ;}
        .area{margin-left: 80px; background-color:yello; width: 300px; float: left; padding: 2px;height: 320px}
        .pic-area{margin-right: 80px; background-color:hotpin; width: 240px; float: right; padding: 2px; height: 300px; padding-top: 30px;}
        
    
        .myform{margin-left: 0px;font-family: Bahnschrift SemiBold; font-size: 20px; background-color: gree; margin-top: 0px; margin-right: 30px; }
        .name, .dob, .gender{padding-bottom: 5px; }
        .name2{margin-bottom: 20px; background-color: re;}
        .id-image{  margin-bottom: 10px; max-height: 200px; max-width: 200px;}
        .bottom-l{float: left; width: 200px; background-color: hotpin; margin-left:80px; height: 360px; margin-top: 12px;}
        .bottom-r{float: right; width: 420px; background-color: yello; margin-right: 15px;  height: 360px;margin-top: 5px;}
        .in-box{margin-left: 20px; float: righ;}
        .in-name2{ margin-bottom: 13px; width: 400px;}
        select{margin-bottom: 14px; height: 30px; width: 200px; border: 0px; background-color: #b3b9b3;font-family:Bahnschrift SemiBold; font-size: 17px; padding: 2px; }
        option{background-color: white;}
        .butn{float :left; margin-top: 40px; width: 400px; margin left: 200px; margin-bottom: 40px;}
        .click{background-color:#2e7d32 ;font-family: Bahnschrift SemiBold; color: whitesmoke; width: 100px; border-radius: 5px;  margin-right: 20px;}
        
        
        
    
        
        
        
    
    </style>
    
   
    
    
    </head>
<body  >
    <div class="form-box">
    <form method="post" action="senddata.php" autocomplete="off" name="myform" class="myform" enctype="multipart/form-data">
        <img class="logo-form" src="images/doc%20logo.png">
        <p class="form-name">FORM</p>
        <br>
        <br>
        
        <div class="area">
           
        <p class="name">FIRST NAME:<br></p><input type="text" name="fname">    
        <p class="name"><br>LAST NAME:<br></p><input type="text"name="lname">
        <p class="dob"><br> DATE OF BIRTH:<br></p><input type="date"name="dob">
        <p class="gender"><br> GENDER:<br></p>
           &nbsp;&nbsp;&nbsp; <input type="radio" name="gender" value="male"> Male &nbsp;&nbsp;&nbsp;
                              <input type="radio" name="gender" value="female"> Female &nbsp;&nbsp;&nbsp; 
                              <input type="radio" name="gender" value="other"> Other
           
           
        </div>
        
         <script>
     function readURL(input)
        {
             if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) 
                {
                    $('#proimg').attr('src', e.target.result);
                };

                reader.readAsDataURL(input.files[0]);
            }
        }
            
    
    
    </script>
        
        <div class="pic-area">
            <img class="id-image" id="proimg" alt="FORM ID image" src="images/id%20image.png">
            
            <input type="file" name="logo" onchange="readURL(this);">
        
        
        </div>

        <div class="bottom-l">
            <br> <p class="name2">E-MAIL        :  </p>
                 <p class="name2">MOBILE NO.   </p> 
                 <p class="name2">ADDRESS line 1:   </p> 
                 <p class="name2">ADDRESS line 2:   </p> 
                 <p class="name2">PIN CODE      :   </p> 
                 <p class="name2">STATE         :   </p> 
                 <p class="name2">CITY         :   </p>              
                 <p class="name2">CATEGORY      :   </p> 
        
        
        
        </div>
        <div class="bottom-r">
        <input class="in-name2" type="email" style="margin-top:21px;"    name="email">
        <input class="in-name2" type="text"  style="margin-bottom:15px;" name="mobile">
        <input class="in-name2" type="text"  style="margin-bottom:14px;" name="addrs1">
        <input class="in-name2" type="text"  style="margin-bottom:12px;" name="addrs2">
        <input class="in-name2" type="text"  style="margin-bottom:14px;" name="pin">
            <br>
        <select value="select" name="state">
            <option disabled selected>..select..</option>
            <option value="bihar">Bihar</option>
            <option>Chandigarh</option>
            <option>Delhi</option>
            <option>Gujrat</option>
            <option>Haryana</option>
        </select>
            <br>       
        <input class="in-name2" type="text" name="city"><br>
         &nbsp;&nbsp;&nbsp; <input class="in-name2" type="checkbox" name="cate[]">General &nbsp;&nbsp;&nbsp;
                            <input class="in-name2" type="checkbox" name="cate[]">OBC &nbsp;&nbsp;&nbsp;
                            <input class="in-name2" type="checkbox" name="cate[]">ST &nbsp;&nbsp;&nbsp;
                            <input class="in-name2" type="checkbox" name="cate[]">SC
        
        
        </div>
        
        <div class="butn" style="margin-left:250px;">
            <input class="click" type="submit" name="submit">        
            <input class="click" type="reset" name="reset">       
        </div>
    
        
        
    </form>
    
    
    </div>
    
    
    
    
    </body>







</html>