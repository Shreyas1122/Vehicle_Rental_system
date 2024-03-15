import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.io.IOException;
import java.util.Scanner;

class Scooty {
 private    int Model;

int  ask_model(){
     boolean decision;
     int var=0;

     do{
         if(var>=1){
             System.out.println("you have entered invalid or model which is not available here");
         }
      try{

         System.out.println("Following are the Models avaialbale here");
         System.out.println("1)ACTIVA\n2)ACCESS\n3)Ray\n4)BURGMAN\n5)NTORQ");
         System.out.println("which type of model do you need(choose Number): ");
        Scanner obj=new Scanner(System.in);
        Model=obj.nextInt();}catch(Exception e){
          System.out.println("Invalid input given please enter valid input");
          decision=true;
      }
       if(Model==1||Model==2||Model==3||Model==5||Model==4){
          decision=false;
       }
       else{
           decision=true;
           var++;
       }
     }while(decision);
    return Model;    }

}
class four_wheeler{
   public static     int  Model;
    private int  Sub_model;
    int driver_hour(){
        boolean decision;
        do{
            try{
                System.out.println("For how many hours you want the driver ");
                Scanner obj=new Scanner(System.in);
                int re=obj.nextInt();
                if(re==0){
                    System.out.println("please eneter the valid option ngreater than 0");
                    decision=true;
                }
                else{
                    decision=false;
                    return re;
                }
            }catch(Exception e){
                System.out.println("please enetr the valid option of interger only");
                decision=true;
            }}while(decision);
        return 0;
    }
    static void  total_bill_personal(int bill,int Driver){
        int re=bill+Driver;
        int Cgst=(5*re)/100;
        int Sgst=(5*re)/100;
        System.out.println("CGST= "+Cgst);
        System.out.println("SGST= "+Sgst);
        System.out.println("Driver/Guide = "+Driver);
        int subtotal=re+Cgst+Sgst;
        System.out.println("your subtotal ="+subtotal);


    }
    static void total_bill_car(int bill,int driver,int guide){
        int re=bill+driver+guide;
        int Cgst=(5*re)/100;
        int Sgst=(5*re)/100;
        System.out.println("your total is "+ re);
        System.out.println("CGST= "+Cgst);
        System.out.println("SGST= "+Sgst);
        System.out.println("Driver= "+driver);
        System.out.println("Guide= "+ guide);
        int subtotal=re+Cgst+Sgst;
        System.out.println("your subtotal ="+subtotal);

    }

    int   ask_model(){
        boolean decision;
        int var=0;

        do{
            if(var>=1){
                System.out.println("you have entered invalid or model which is not available here\n**please Enter String type Input only**");
            }


            System.out.println("Following are the company  avaialbale here");
            System.out.println("1)Maruti Suzuki\n2)Hyundai\n3)Honda \n4)MG(moris Garage) \n5)Tata\n6)Mahindra");
            System.out.println("please choose the company of the car  do you need(choose Number):");
            Scanner obj=new Scanner(System.in);
            Model=obj.nextInt();
            if(Model==1){
                System.out.println("Following are the Models of Maruti Suzuki avaialbale here");
                System.out.println("1)Wagnor\n2)Celerio\n3)Vitara Brezza \n4)Ciaz \n5)Ertiga\n6)S-presso");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4||Sub_model==5){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }

            } else if (Model==2) {
                System.out.println("Following are the Models of Hyundai avaialbale here");
                System.out.println("1)Aura\n2)venue\n3)Verna \n4)creta \n5)i-20\n6)Exter");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4||Sub_model==5){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }
            } else if (Model==3) {
                System.out.println("Following are the Models of Honda avaialbale here");
                System.out.println("1)Honda City\n2)Honda Amaze\n3)Jazz \n4)Elevate");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }


            }
            else if(Model==4){
                System.out.println("Following are the Models of MG  available here");
                System.out.println("1)Hector \n2)Astor\n3)Gloster \n4)Hector Plus");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }



            } else if (Model==5) {
                System.out.println("Following are the Models of Tata  avaialbale here");
                System.out.println("1)Nexon\n2)Punch\n3)Harrier \n4)Altroz\n5)Tiago");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4||Sub_model==5){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }
            }
            else if(Model==6){
                System.out.println("Following are the Models of Mahindra avaialbale here");
                System.out.println("1)Scorpio\n2)Thar \n3)XUV700 \n4)XUV300\n5)Marazzo");
                System.out.println("please choose the Models of the car  do you need");
                Sub_model=obj.nextInt();
                if(Sub_model==1||Sub_model==2||Sub_model==3||Sub_model==4||Sub_model==5){
                    decision=false;
                    return Sub_model;
                }
                else{
                    decision=true;
                }
            }
            else{
                decision=true;
                var++;
            }
        }while(decision);
        return Sub_model;    }

}
class Vehicle extends Exception {
    public static int guide_hour=1;
 private static    int hours;
  private   int vehicle_type;
  private int what_use;
  private int ask_driver;
  int ask_guide(){
      boolean decision;
      int result;
      int var=0;
      do{
          if(var>=1){
              System.out.println("Please Enter the valid option from above only");
          }
          String   Descrip="Do you want Guide for your Journey?";
          String Sub_description="1)yes\n2)no(choose option only):   ";
          result=input_user(Descrip,Sub_description);
           if (result != 1 && result != 2) {
              decision=true;
              var++;
          }
          else if(result==1){
              guide_hour=ask_guide_hours();
               decision=false;
          }
          else{
              decision=false;
          }}while(decision);
      return result;

  }
  static int ask_guide_hours(){
      boolean decision;
      do{
      try{
      System.out.println("For how many hours you want the guide ");
      Scanner obj=new Scanner(System.in);
      int re=obj.nextInt();
      if(re==0){
          System.out.println("please eneter the valid option ngreater than 0");
          decision=true;

      }
      else{
          decision=false;
          return re;
      }
      }catch(Exception e){
          System.out.println("please enetr the valid option of interger onbly");
          decision=true;

      }}while(decision);
      return 0;
  }
  int ask_driver(){
      boolean decision;
      int result;
      do{
    String   Descrip="Do you want driver for your Journey?";
    String Sub_description="1)yes\n2)no(choose option only):   ";
    result=input_user(Descrip,Sub_description);
          if (result != 1 && result != 2) {
          decision=true;
          }
      else{
          decision=false;
          }}while(decision);
      return result;


  }
    int  hours_check(){
       String decrip="  please enter the no. hours of yours you need our vehicle";
       String sub_decription="Like( 1 , 2 , 3 or 10) hours:";
       hours =input_user(decrip,sub_decription);
         return hours;
    }
   public static  int return_hours(){
        return hours;
    }
    int  Vehicle_type(){
        boolean decision;
        int result=0;
        do{
        String Descrip="following are the vehicle available here\n1)scooters(non-gear)\n2)Cars";
        String inpu_text="please choose your vehicle_type(choose numbers from above):";
         result=input_user(Descrip,inpu_text);
        if(result!=1&&result!=2){
            System.out.println("please enter the valid option from the above only");
            decision=true;
        }
        else{decision=false;}
        }while(decision);
        return result;

        }
    int  ask_what_use(){
        boolean decision;
        int result=0;
        do{
            String Descrip="Do you want this vehcicle for the following use";
            String inpu_text="1)for Personal Use\n2)For Tourist Use(choose options of number):";
            result=input_user(Descrip,inpu_text);
            if(result!=1&&result!=2){
                System.out.println("please enter the valid option from the above only");
                decision=true;
            }
            else{decision=false;}
        }while(decision);
        return result;
    }
   static  int  input_user(String Description,String input_text){
        boolean decision;
        int inpu_var=0;
        do {
            try {
                System.out.println(Description);
                System.out.print(input_text);
                Scanner obj=new Scanner(System.in);
                inpu_var = obj.nextInt();
                decision=false;

            } catch (Exception e) {
                System.out.println("please choose the valid option from above");
                decision=true;
            }
        }while(decision);
        return inpu_var;
    }

   int ask_licnse(){
        boolean decision;
        int license_number;
        do{  System.out.println("please provide your license number for verification");
            Scanner input=new Scanner(System.in);
             license_number=input.nextInt();
            if(license_number>=100000 && license_number<=999999){
          decision=false;
        }
        else{
            System.out.println("Invalid License Number!license number should be only of 6 digits");
            decision=true;
        }}while(decision);
        return license_number;
    }




}
class hours_exceed extends Exception{
  private  int hours_incre;
  private int hours_number;
  private static  int total_hours;
  private int want_food_decision;



  int ask_hours_incre(){
      boolean decision;
      do{
      try{
      System.out.println("Do you want to increment or Exceed your hours ");
      System.out.println("1)yes\n2)no\n(choose option) :");
      Scanner obj=new Scanner(System.in);
      hours_incre=obj.nextInt();
      if(hours_incre!=1&&hours_incre!=2){
          System.out.println("Please select the valid option from the above");
          decision=true;

      }
      else if (hours_incre==1){
         System.out.println("please type how many hours you want to exceed");
         hours_number=obj.nextInt();
         total_hours=Vehicle.return_hours();
         total_hours=total_hours+hours_number;
         decision=false;
         System.out.println("You have Successfully added "+hours_number+ "hours in your list of Journey");
         System.out.println("happy Journey !");
         return total_hours;
      }
      else{
          System.out.println("Okay! Your Bill Will be Provided below");
      decision=false;
      return Vehicle.return_hours();
      }}
      catch(Exception e){
          System.out.println("Invalid input Provided by the user. please enter valid input");
          decision=true;
      }

  }
  while(decision);
  return 0;
  }

}
class Hotel_and_Rooms extends Exception{
    private int Choose_restuarant_veg;
    private int Choose_restuarant_nonveg;
    private int Rooms_check;
    private int hotel_name_veg;
    private int hotel_name_nonveg;

   void veg_hotel(){
        System.out.print("hotel is veg");
    }
    void non_veg_hotel(){
       System.out.println("hotel is non veg");
    }


    int hotelask_veg_nonveg(){

        int veg_or_nonveg;
        boolean deci ;

        do{
            System.out.println("Are you veg or Non veg\n");
            System.out.print("1)veg\n2)Non-veg(choose Option):  ");
            Scanner inpuu=new Scanner(System.in);
            veg_or_nonveg=inpuu.nextInt();
            if(veg_or_nonveg==1){
                //vegetarian customer
                hotel_name_veg= Hotels_nearby_veg();
                veg_hotel();
                deci=false;
                return hotel_name_veg;
            }
            else if(veg_or_nonveg==2){
                //nonveg hotel
                hotel_name_nonveg=Hotels_nearby_nonveg();
                non_veg_hotel();
                deci=false;
            return  hotel_name_nonveg;}
            else{
                deci=true;
            }}while(deci);
        return 0;

    }

    static int decision(String descrip,String subdescrip){
        boolean decision;
        int result;
        do{
            result=Vehicle.input_user(descrip,subdescrip);
            if (result != 1 && result != 2) {
                decision=true;
            }
            else{
                decision=false;
            }}while(decision);
        return result;

    }

    int Hotels_nearby_nonveg(){
        boolean decision;
        do {
            Choose_restuarant_nonveg = input_user("Here are the  best Hotels nearby From Your Current  Location", "1)Rajesh Sons Restaurants\n2)Kavita Family Restaurant\n3)NEW India Future Hotel and Bar\n4)ThePunjabi Dhaba \n5)Hello Heights(choose option) :");
            if(Choose_restuarant_nonveg!=1&&Choose_restuarant_nonveg!=2&&Choose_restuarant_nonveg!=3&&Choose_restuarant_nonveg!=4&&Choose_restuarant_nonveg!=5){
                decision=true;
            }
            else{decision=false;}
        }while(decision);
        return Choose_restuarant_nonveg;
    }
    int Hotels_nearby_veg(){
        boolean decision;
        do {
            Choose_restuarant_veg = input_user("Here are the  best Hotels nearby From Your Current  Location", "1)KALA PURE VEG HOTEL\n2)KALPIT PURE VEG RESTAURANT\n3)OM SAI VEG RESTUARANT\n4)PANIPAT HOTEL VEG ONLY \n5)JAINS HOTELS(choose option): ");
            if(Choose_restuarant_veg!=1&&Choose_restuarant_veg!=2&&Choose_restuarant_veg!=3&&Choose_restuarant_veg!=4&&Choose_restuarant_veg!=5){
                decision=true;
            }
            else{decision=false;}
        }while(decision);
        return Choose_restuarant_veg;


    }
    int Rooms_nearby(){
        boolean decision;
        do{
           Rooms_check=input_user("Here are the best Rooms and Hotels Available nearby from your current location\n","1)Kailsh Residency\n2)Gopal das Residency\n3)Kshitija Rooms and Restuarants\n4)Mama-Bhacha Dine and Residency\n5)Nitin walia Rooms\n(choose option from below) :");
            if(Rooms_check!=1&&Rooms_check!=2&&Rooms_check!=3&&Rooms_check!=4&&Rooms_check!=5){
              decision=true;
            }
            else{
            decision=false;}

        }while (decision);
        return Rooms_check;


    }
    int ask_room(){
      boolean deci;
        int rooms_want=0;
       do{
           try{

       System.out.println("\nDo you want Rooms For Stay at nearby Hotels/Delux Rooms");
       System.out.println("NOTE-**You will not provide the Additional time for stay at rooms from us.you have to stay under hours you chosen. If you want to increment hours then contact us Now!**");
       System.out.println("1)YES\n 2)No");
       Scanner obj=new Scanner(System.in);
      rooms_want= obj.nextInt();}catch(Exception e){System.out.println("Inavlid Input from user Enter valid integer input");
           deci=true;}
      if(rooms_want==1){
          int rooms_name=Rooms_nearby();
          deci=false;
          return rooms_name;
      }
      else if(rooms_want==2){
          deci=false;
          return 0;
      }
      else{
          deci=true;
      }}while(deci);

return 0;
    }
    int input_user(String descrip,String subdescrip){
        boolean decision;
        int var=0;
        do{
            try{
                System.out.println(descrip);
                System.out.print(subdescrip);
                Scanner obj=new Scanner(System.in);
               var= obj.nextInt();
                decision=false;}
            catch(Exception e){
                System.out.println("please enter the valid Integer option only");
                decision=true;
            }

        }while(decision);
        return var;
    }
}
class total_bill{
    void total_bill(int bill){
        System.out.println("your total bill is" + bill);
        int gst=(bill*5)/100;
        System.out.println("CGST= "+ (bill*5)/100);
        System.out.println("SGST= "+ (bill*5)/100);
        int result=bill+gst+gst;
        System.out.print("total ="+result);

    }
    void total_billsss(int bill,int guide){
        System.out.println("your total bill is" + bill);
        System.out.println("Tourist Guide="+guide);
        int gst=(bill*5)/100;
        System.out.println("CGST= "+ (bill*5)/100);
        System.out.println("SGST= "+ (bill*5)/100);
        int  total_bill=bill+gst+gst+1000;
        System.out.print("total ="+total_bill);
    }
}


class executed{
    public static void main(String args []){
        int car_model=0;
        int what_use=0;
        int scooty_model=0;
        int vehicle=0;
      int   total_hours=0;
        int rooms_name;
        int rooms_decision;
        int guide=0;
        int hotels_want;
        int hotel_name;
       int  driver=0;
       int dri_hours=1;
       int what_use_car = 0;
        Hotel_and_Rooms hotel=new Hotel_and_Rooms();
        hours_exceed object3=new hours_exceed();
        Vehicle object=new Vehicle();
        four_wheeler four_w=new four_wheeler();
     int hours =  object.hours_check();
     if(hours>=24){
         System.out.println("Registration is necessary(atleast before 1 day) to Get a Vehicle for this hours");

     }
     else{
        vehicle = object.Vehicle_type();
       if(vehicle==1){
           Scooty scobj=new Scooty();
       scooty_model = scobj.ask_model();
       what_use= object.ask_what_use();
      if(what_use==1){
          //personal use
System.out.println("you want scooty for personal use\n ");
          hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
          if(hotels_want==1){
              hotel_name=hotel.hotelask_veg_nonveg();
              System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
              System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));
          }
          else{
              hotel_name=0;
          }
          rooms_decision=hotel.ask_room();
          if(rooms_decision==1){
              rooms_name=hotel.Rooms_nearby();
          }
          else{
              System.out.println("Okay! No issues ");
          }
          //ask hours increments
          total_hours=object3.ask_hours_incre();




      }
      else{
       //  System.out.println("you want scooty for tourist use");
         guide =object.ask_guide();
          hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
          if(hotels_want==1){
              hotel_name=hotel.hotelask_veg_nonveg();
              System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
              System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));
          }
          else{
              hotel_name=0;
          }
          rooms_decision=hotel.ask_room();
          if(rooms_decision==1){
              rooms_name=hotel.Rooms_nearby();

          }
          else{
              System.out.println("Okay! No issues ");
          }
          //ask hours increments
          total_hours=object3.ask_hours_incre();

      }

       }
       else{
           //this is for car

           four_wheeler carobj=new four_wheeler();
        car_model=  carobj.ask_model();
            what_use_car= object.ask_what_use();
           if(what_use_car==1){
               //personal use car
             driver= object.ask_driver();
            if(driver==1){
              dri_hours= four_w.driver_hour();
                hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
                if(hotels_want==1){
                    hotel_name=hotel.hotelask_veg_nonveg();
                    System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
                    System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));}
                else{
                    hotel_name=0;
                }
                rooms_decision=hotel.ask_room();
                if(rooms_decision==1){
                    rooms_name=hotel.Rooms_nearby();

                }
                else{
                    System.out.println("Okay! No issues ");
                }
                //ask hours increments
                total_hours=object3.ask_hours_incre();

            }
            else{
                //no driver car

              int licenseno= object.ask_licnse();
              if(licenseno==666666){
                  System.out.println("License No successfully verified\n");
                  hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
                  if(hotels_want==1){
                      hotel_name=hotel.hotelask_veg_nonveg();
                      System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
                      System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));}
                  else{
                      //no hotel needed
                      hotel_name=0;
                  }
                  rooms_decision=hotel.ask_room();
                  if(rooms_decision==1){
                      rooms_name=hotel.Rooms_nearby();

                  }
                  else{
                      System.out.println("Okay! No issues ");
                  }
                  //ask hours increments
                  total_hours=object3.ask_hours_incre();
              }
              else{
                  System.out.println("invalid license number provided");
              }
            }

           }
           else{
               //tourist use car
                driver= object.ask_driver();
               if(driver==1){
                   dri_hours=four_w.driver_hour();
                   guide=object.ask_guide();
                   //hotelask want tourist car
                   hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
                   if(hotels_want==1){
                     hotel_name=hotel.hotelask_veg_nonveg();
                     System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
                     System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));
                   }
                   else{
                      hotel_name=0;
                   }
                   rooms_decision=hotel.ask_room();
                   if(rooms_decision==1){
                       rooms_name=hotel.Rooms_nearby();

                   }
                   else{
                       System.out.println("Okay! No issues ");
                   }
                   //ask hours increments
                   total_hours=object3.ask_hours_incre();

               }
               else{
                   //no driver car
               int licenseno= object.ask_licnse();
               if(licenseno==666666){
                   System.out.println("License No successfully verified");
                   guide= object.ask_guide();
                   hotels_want=Hotel_and_Rooms.decision("Do you want to have breakfast or lunch at your favourite hotel between your journey","1)yes\n2)no (Choose Option):  ");
                   if(hotels_want==1){
                       hotel_name=hotel.hotelask_veg_nonveg();
                       System.out.println("\n\nCongrations!!!! you got 40 minutes free for your lunch/breakfast.Have a relax lunch/breakfast");
                       System.out.printf("your total time remaining is %d minutes ",(Vehicle.return_hours()*60+40));
                   }
                   else{
                       hotel_name=0;
                   }
                   rooms_decision=hotel.ask_room();
                   if(rooms_decision==1){
                       rooms_name=hotel.Rooms_nearby();

                   }
                   else{
                       System.out.println("Okay! No issues ");
                   }
                   //ask hours increments
                   total_hours=object3.ask_hours_incre();

               }
               else{
                   System.out.println("invalid license number provided");
               }}
           }


       }

     }
        //bill calculation for scooty
        if(vehicle==1){
            total_bill obj=new total_bill();
            int bill;
            if(what_use==1){
            if(scooty_model==1){
                     bill=1000*total_hours;
                   obj.total_bill(bill);

                }
            else if(scooty_model==2){
                bill=1500*total_hours;
                obj.total_bill(bill);
            }
            else if(scooty_model==3){
                bill=1200*total_hours;
                obj.total_bill(bill);
            }
            else if(scooty_model==4){
                bill=2000*total_hours;
                obj.total_bill(bill);
            } else if(scooty_model==5){
                bill=2000*total_hours;
                obj.total_bill(bill);
            }}else{
                if(guide==1){
                if(scooty_model==1){
                    bill=1000*total_hours;
                    obj.total_billsss(bill,1000*Vehicle.guide_hour);

                }
                else if(scooty_model==2){
                    bill=1500*total_hours;
                    obj.total_billsss(bill,1000*Vehicle.guide_hour);
                }
                else if(scooty_model==3){
                    bill=1200*total_hours;
                    obj.total_billsss(bill,1000*Vehicle.guide_hour);
                }
                else if(scooty_model==4){
                    bill=2000*total_hours;
                    obj.total_billsss(bill,1000*Vehicle.guide_hour);
                } else if(scooty_model==5){
                    bill=2000*total_hours;
                    obj.total_billsss(bill,1000*Vehicle.guide_hour);
                }}
                else{
                    if(scooty_model==1){
                        bill=1000*total_hours;
                        obj.total_bill(bill);

                    }
                    else if(scooty_model==2){
                        bill=1500*total_hours;
                        obj.total_bill(bill);
                    }
                    else if(scooty_model==3){
                        bill=1200*total_hours;
                        obj.total_bill(bill);
                    }
                    else if(scooty_model==4){
                        bill=2000*total_hours;
                        obj.total_bill(bill);
                    } else if(scooty_model==5){
                        bill=2000*total_hours;
                        obj.total_bill(bill);
                    }

                }

            }

        }
        else {

           if(four_wheeler.Model==1){
               if(car_model==1||car_model==2||car_model==6){
                   if(driver==1&& guide==0||driver==1&&guide==2){
                       System.out.println("i want only driver bhai");
                       four_wheeler.total_bill_personal(1500*total_hours,1500*dri_hours);
                   }
                   else if (driver==1 && guide==1){
                       //want guide and driver too
                       System.out.println(" i want both driver and guide");
                       four_wheeler.total_bill_car(1500*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);
                   }
                   else if(guide==1&& driver ==0||driver==2&&guide==1){
                       //want guide only dear
                       System.out.println(" i want only guide bhai");
                       four_wheeler.total_bill_personal(1500*total_hours,1000*Vehicle.guide_hour);

                   }
                   else{
                       four_wheeler.total_bill_personal(1500*total_hours,0);
                   }

               }
               else if(car_model==3||car_model==4){
                   if(driver==1&& guide==0||driver==1&&guide==2){
                       four_wheeler.total_bill_personal(2000*total_hours,1500*dri_hours);
                   }
                   else if (driver==1 && guide==1){
                       four_wheeler.total_bill_car(2000*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                   }
                   else if(guide==1&& driver ==0||driver==2&&guide==1){
                       //want guide only dear
                       four_wheeler.total_bill_personal(2000*total_hours,1000*Vehicle.guide_hour);

                   }
                   else{
                       four_wheeler.total_bill_personal(2000*total_hours,0);
                   }
               }
               else if(car_model==5){
                   if(driver==1&& guide==0||driver==1&&guide==2){
                       four_wheeler.total_bill_personal(2500*total_hours,1500*dri_hours);}
                   else if (driver==1 && guide==1){
                       //want guide and driver too
                       four_wheeler.total_bill_car(2500*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                   }
                   else if(guide==1&& driver ==0||driver==2&&guide==1){
                       //want guide only dear
                       four_wheeler.total_bill_personal(2500*total_hours,1000*Vehicle.guide_hour);

                   }
                   else{
                       four_wheeler.total_bill_personal(2500*total_hours,0);}
               }
           }
           else if(four_wheeler.Model==2){
               if(car_model==1||car_model==2){
                   System.out.println("i am inside the model yarrr");
                   if(driver==1&& guide==0||driver==1&&guide==2){
                       System.out.print("i am inside driver yarrr");
                       four_wheeler.total_bill_personal(1700*total_hours,1500*dri_hours);
                   }
                   else if (driver==1 && guide==1){
                       //want guide and driver too
                       System.out.println("hahhahahahhahah");
                       four_wheeler.total_bill_car(1700*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                   }
                   else if(guide==1&& driver ==0||driver==2&&guide==1){
                       //want guide only dear
                       four_wheeler.total_bill_personal(1700*total_hours,1000*Vehicle.guide_hour);

                   }
                   else{
                       four_wheeler.total_bill_personal(1700*total_hours,0);
                   }

               }
               else if(car_model==3||car_model==4||car_model==5){
                   if(driver==1&& guide==0||driver==1&&guide==2){
                       four_wheeler.total_bill_personal(2500*total_hours,1500*dri_hours);
                   }
                   else if (driver==1 && guide==1){
                       //want guide and driver too
                       four_wheeler.total_bill_car(2500*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);


                   }
                   else if(guide==1&& driver ==0||driver==2&&guide==1){
                       //want guide only dear
                       four_wheeler.total_bill_personal(2500*total_hours,1000*Vehicle.guide_hour);

                   }
                   else{
                       four_wheeler.total_bill_personal(2500*total_hours,0);
                   }
               }

           }
           else if(four_wheeler.Model==3){
               if(driver==1&& guide==0||driver==1&&guide==2){
                   four_wheeler.total_bill_personal(2000*total_hours,1500*dri_hours);
               }
               else if (driver==1 && guide==1){
                   //want guide and driver too
                   four_wheeler.total_bill_car(2000*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

               }
               else if(guide==1&& driver ==0||driver==2&&guide==1){
                   //want guide only dear
                   four_wheeler.total_bill_personal(2000*total_hours,1000*Vehicle.guide_hour);

               }
               else{
                   four_wheeler.total_bill_personal(2000*total_hours,0);
               }
           }
           else if(car_model==5){
               if(driver==1&& guide==0||driver==1&&guide==2){
                   four_wheeler.total_bill_personal(2500*total_hours,1500*dri_hours);}
               else if (driver==1 && guide==1){
                   //want guide and driver too
                   four_wheeler.total_bill_car(2500*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

               }
               else if(guide==1&& driver ==0||driver==2&&guide==1){
                   //want guide only dear
                   four_wheeler.total_bill_personal(2500*total_hours,1000*Vehicle.guide_hour);

               }
               else{
                   four_wheeler.total_bill_personal(2500*total_hours,0);}
           }

            else if(four_wheeler.Model==3){
                if(car_model==1||car_model==2||car_model==4){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(1800*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(1800*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(1800*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(1800*total_hours,0);
                    }

                }
                else if(car_model==3){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(2200*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(2200*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(2200*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(2200*total_hours,0);
                    }
                }

            }
            else if(four_wheeler.Model==4){
                if(car_model==1||car_model==2){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(2500*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(2500*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(2500*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(2500*total_hours,0);
                    }

                }
                else if(car_model==3||car_model==4){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(3000*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(3000*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(3000*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(3000*total_hours,0);
                    }
                }

            }
            else if(four_wheeler.Model==5){
                if(car_model==1||car_model==3||car_model==4){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(2800*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(2800*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(2800*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(2800*total_hours,0);
                    }

                }
                else if(car_model==2||car_model==5){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(1900*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(1900*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(1900*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(1900*total_hours,0);
                    }
                }

            }
            else if(four_wheeler.Model==6){
                if(car_model==1||car_model==2||car_model==3){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(3000*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(3000*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(3000*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(3000*total_hours,0);
                    }

                }
                else if(car_model==4){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(1800*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(1800*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(1800*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(1800*total_hours,0);
                    }
                }
                else if(car_model==5){
                    if(driver==1&& guide==0||driver==1&&guide==2){
                        four_wheeler.total_bill_personal(2800*total_hours,1500*dri_hours);
                    }
                    else if (driver==1 && guide==1){
                        //want guide and driver too
                        four_wheeler.total_bill_car(2800*total_hours,1500*dri_hours,1000*Vehicle.guide_hour);

                    }
                    else if(guide==1&& driver ==0||driver==2&&guide==1){
                        //want guide only dear
                        four_wheeler.total_bill_personal(2800*total_hours,1000*Vehicle.guide_hour);

                    }
                    else{
                        four_wheeler.total_bill_personal(2800*total_hours,0);
                    }
                }

            }



            }

        }



    }

