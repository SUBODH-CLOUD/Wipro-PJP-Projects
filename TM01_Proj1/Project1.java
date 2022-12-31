class Project1{
    public static void main(String[] args) {
        
        String[] arr = new String[]{"Emp No.    ", "Emp Name   ", "Department ","Designation", "Salary     " };
        String[][] arr2 = new String[7][8];
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        

        arr2[0][0] = "1001       ";
        arr2[1][0] = "1002       ";
        arr2[2][0] = "1003       ";
        arr2[3][0] = "1004       ";
        arr2[4][0] = "1005       ";
        arr2[5][0] = "1006       ";
        arr2[6][0] = "1007       ";

        
        arr2[0][1] = "Ashish     ";
        arr2[1][1] = "Sushma     ";
        arr2[2][1] = "Rahul      ";
        arr2[3][1] = "Chahat     ";
        arr2[4][1] = "Ranjan     ";
        arr2[5][1] = "Suman    ";
        arr2[6][1] = "Tanmay     ";

        arr2[0][2] = "R&D        ";
        arr2[1][2] = "PM         ";
        arr2[2][2] = "Acct       ";
        arr2[3][2] = "Front Desk ";
        arr2[4][2] = "Engg       ";
        arr2[5][2] = "Manufactoring";
        arr2[6][2] = "PM         ";

        arr2[0][3] = "Engineer    ";
        arr2[1][3] = "Consultant ";
        arr2[2][3] = "Clerk      ";
        arr2[3][3] = "Receptionist";
        arr2[4][3] = "Manager    ";
        arr2[5][3] = " Engineer  ";
        arr2[6][3] = "PM         ";

        arr2[0][4] = "45000      ";
        arr2[1][4] = "65000       ";
        arr2[2][4] = "29000       ";
        arr2[3][4] = "31000       ";
        arr2[4][4] = "90000       ";
        arr2[5][4] = "47600       ";
        arr2[6][4] = "63000       ";

       
        

        String EmpNo = args[0];
        switch(EmpNo){
            case "1001" :
                    int i=0;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i][j] + " ");
                      
                    }
                    break;
            case "1002" :
            int i1=1;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i1][j] + " ");
                      
                    }
                    break;
            case "1003" :
            int i2=2;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i2][j] + " ");
                      
                    }
                    break;
            case "1004" :
            int i3=3;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i3][j] + " ");
                      
                    }
                    break;
            case "1005" :
            int i4=4;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i4][j] + " ");
                      
                    }
                    break;
            case "1006" :
            int i5=5;
                    for(int j = 0; j<5; j++){
                      System.out.print(arr2[i5][j] + " ");
                      
                    }
                    break;
            case "1007" :
            int i6=6;
            for(int j = 0; j<5; j++){
              System.out.print(arr2[i6][j] + " ");
              
            }
            break;
           default :
           System.out.println("There is no employee with empid : " + EmpNo);
        }
        
    }
}