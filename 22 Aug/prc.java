class prc
     {
         public static void main(String[] args) {
            String nonTrimmedString ="hrry";
            String nm="kirnrndhuml";
            System.out.println(nonTrimmedString);
            System.out.println(nonTrimmedString.trim());
            System.out.println(nonTrimmedString.substring(2));
            System.out.println(nm.startsWith("ir"));
            System.out.println(nm.endsWith("rn"));
            System.out.println(nm.substring(2,4));
            System.out.println(nm.charAt(3));
            System.out.println(nm.indexOf("dh ", 1));
            System.out.println(nm.indexOf("rn"));
            //System.out.println(nm.lastIndexOf(ml, 2));
            System.out.println(nm.equals("kirnrndhuml"));
            System.out.println(nm.equals("kir"));
            System.out.println(nm.equalsIgnoreCase("KirnrnDhUml"));
            System.out.println(nm.replace("rn","5"));
            int f=11;
            for(int i=0;i<=f;i++){
                if(i==3){
                    continue;

                }
                System.out.println(i);
                }
                int num=123,c=0;
                int rem=0;
            while(num>=0){
                rem=num%10;
                c= c+rem;
                rem=rem/10;
                break;
                System.out.println(c);

            }


            }
            
          
            
         }
     