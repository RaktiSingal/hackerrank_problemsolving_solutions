/*Question:  


ROAD REPAIR
A number of points along the highway are in need of repair. An equal number of crews are available, stationed at various points along the highway. They must move along the highway to reach an assigned point. Given that one crew must be assigned to each job, what is the minimum total amount of distance traveled by all crews before they can begin work?

 

For example, given crews at points {1,3,5} and required repairs at {3,5,7}, one possible minimum assignment would be {1→ 3, 3 → 5, 5 → 7} for a total of 6 units traveled.

 

Function Description

Complete the function getMinCost in the editor below. The function should return the minimum possible total distance traveled as an integer.

 

getMinCost has the following parameter(s):

    crewId[crewId[0],...crewId[n-1]] : a vector of integers

    jobId[jobId[0],...jobId[n-1]] : a vector of integers

 

Constraints

1 < n < 105

crewId[i] : 1 < crewId[i] < 109

jobId[i] : 1 < jobId[i] < 109
   
      
      
      */
      //                                                      SOLUTON IN JAVA
      
      
      class Result {

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {

        long cost=0;

        Collections.sort(crew_id);

        Collections.sort(job_id);

        int len1=crew_id.size();

        int len2=job_id.size();

        if(len1==len2)

        {

            for(int i=0;i<len1;i++)

            {

                if(job_id.get(i)>=crew_id.get(i))

                {

                    cost=cost+(job_id.get(i)-crew_id.get(i));

                }

                else if(job_id.get(i)<crew_id.get(i))

                {

                    cost=cost+(crew_id.get(i)-job_id.get(i));

                }

            }

        }

        return cost;

    } 

}
      
