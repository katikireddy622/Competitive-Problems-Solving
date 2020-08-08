/*
case 1:

2
19.076090 17.387140
72.877426 78.491684
2 1
18.516726 73.856255


case-2:

2
28.644800 22.572645
77.216721 88.363892
5 7
48.864716 2.349014

*/

//sqrt(2hR)

import java.util.Scanner;


public class CellTowerProblem {

    public  int n;
    public  double lat[];
    public  double lon[];
    public  int heights[];
    public  double lat_person;
    public  double lon_person;
    public  double person_distance[];
    public double tower_area[];


    public static void main(String[] args) throws Exception {

        CellTowerProblem ctp=new CellTowerProblem();
        Scanner input=new Scanner(System.in);
        int temp = 1;
        while(temp<6 && input.hasNext()) {

            String s = input.nextLine();

            switch (temp) {
                case 1:
                    ctp.n = Integer.parseInt(s);
                    ctp.lat = new double[ctp.n];
                    ctp.lon = new double[ctp.n];
                    ctp.heights = new int[ctp.n];
                    ctp.person_distance=new double[ctp.n];
                    ctp.tower_area=new double[ctp.n];
                    break;
                case 2:
                    String split_lat[] = s.split(" ");
                    int k = 0;
                    for (String ss : split_lat) {
                        ctp.lat[k] = Double.parseDouble(ss);
                        k++;
                    }
                    break;
                case 3:
                    String split_lon[] = s.split(" ");
                    int kk = 0;
                    for (String ss : split_lon) {
                        ctp.lon[kk] = Double.parseDouble(ss);
                        kk++;
                    }
                    break;
                case 4:
                    String split_height[] = s.split(" ");
                    int kkk = 0;
                    for (String ss : split_height) {
                        ctp.heights[kkk] = Integer.parseInt(ss);
                        kkk++;
                    }
                    break;
                case 5:
                    String split_person[] = s.split(" ");
                    ctp.lat_person = Double.parseDouble(split_person[0]);
                    ctp.lon_person = Double.parseDouble(split_person[1]);
                    break;
            }
            temp++;
        }
            input.close();


            for(int i=0;i<ctp.n;i++)
            {
                ctp.person_distance[i]=distance(ctp.lat_person,ctp.lat[i],ctp.lon_person,ctp.lon[i]);
            }

            for (int j=0;j<ctp.n;j++)
            {
                ctp.tower_area[j]=Math.sqrt(2*ctp.heights[j]*6371);
            }

            int count=0;
            for (int z=0;z<ctp.n;z++)
            {
                if(ctp.tower_area[z]>=ctp.person_distance[z])
                {
                    count++;
                }
            }

            System.out.print(count);

    }


    public static double distance(double lat1,
                                  double lat2, double lon1,
                                  double lon2)
    {
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));
        double r = 6371;
        return(c * r);
    }
}
