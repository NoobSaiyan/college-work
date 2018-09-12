
<html>
<head>
<title>Submitted Form</title>
<style>
    *{margin: 0px; padding: 0px;}
   body{background-color: rebeccapurple;font-family:Bahnschrift SemiBold; font-size: 25px;line-height: 35px;}
    .box{width: 880px; height: 530px; margin:auto; background-color: whitesmoke; box-shadow: 0px 0px 50px 5px black; margin-top: 50px; border-radius: 12px; margin-bottom:50px; padding :20px;}
    .data1{float:left; height: 530px; width:400px;  }
    .data2{float:left; height: 400px; width:auto;  padding-left: 5px; padding-top: 30px; line-height: 60px;}
    
    .fimag{height: 350px; width: 400px; float :left;}
    .fdetail{ float: left; height: 120px; width:auto; padding: 30px; padding-left: 50px; padding-top: 15px; }
    
    .top{float:left; background-color: red; width: 400px; height: 300px;}
    .bottom{float:left; width: auto; padding-left: 30px;}
</style>    
    
</head>
<body>

<div class="box">
    <div class="data1">
        <div class="fimag">
            <div class="top"></div>
            <div class="bottom">
                <?php
                if(isset($_POST['submit']))
{
     /*-----IMAGE FILE----*/                          
    print "File Name :";
    if(!isset($_POST['logo']))
        echo "empty";
    else
    {
        $i=$_POST['logo'];
        echo $i;
        echo"<br>";
    }
                }
                
                ?>
            
            </div>
            
        </div>
        <div class="fdetail">
            <?php
            if(isset($_POST['submit']))
            {
              /*-----FIRST NAME----*/ 
               $z=$_POST['fname']; 
                print "First name : ";
                  if($z=="" )
                    echo "empty";
                 else
                     echo $z; 
              echo"<br>";
            
             /*-----LAST NAME----*/ 
   $z=$_POST['lname']; 
    print "Last name : ";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
            
              /*-----DATE OF BIRTH----*/ 
    $z=$_POST['dob']; 
    print "Date of Birth : ";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
          
             /*-----CGENDER----*/ 
    if(!isset($_POST['gender']))
        $_POST['gender']="empty";
    $g=$_POST['gender'];
    print "Gender : ";
     if($g=="" )
     {  echo $g;}
        else
            echo $g;
    echo"<br>";
            }
            ?>
            
            
        </div>
    
    </div>
    <div class="data2">
        <?php
        if(isset($_POST['submit']))
        {
        
          /*-----EMAIL----*/ 
   $z=$_POST['email']; 
    print "E-mail : ";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
    
    
     /*-----MOBILE NO.----*/ 
     $z=$_POST['mobile']; 
    print "Mobile No. ";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
    
    
     /*-----ADDRESS 1----*/ 
    $z=$_POST['addrs1']; 
    print "Address 1 :";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
    
    
     /*-----ADDRESS 2----*/ 
   $z=$_POST['addrs2']; 
    print "Address 2 : ";
    if($z=="" )
           echo "empty";
        else
            echo $z; 
    echo"<br>";
    
    /*-----STATE----*/  
    if(isset($_POST['state'])){
               print "State : "; echo $_POST['state'];echo"<br>";
        
        
    }else{

               print "State : "; echo"empty";echo"<br>";

    }
    
    /*-----CITY----*/   
    print "City : ";
    $c=$_POST['city'];
    if($c=="")
     echo "empty";
    else
        echo $c;
    echo"<br>";
    
     /*-----CATEGORY----*/ 
    if(isset($_POST['cate']))
         {
   $na= $_POST['cate'];
    foreach($na as $cate) {print "Category :"; echo $cate; echo "<br>";}
    }
    else
        
    {
   
    print "Category : "; echo "empty"; echo "<br>";
    }
        }
        
        
        ?>
    
    
    
    </div>
    
</div>


    
    </body>
</html>



