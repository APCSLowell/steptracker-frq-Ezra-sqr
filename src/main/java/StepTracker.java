import java.util.ArrayList;
public class StepTracker
{
 private int numSteps;
 private int stepMin;
 private ArrayList <int> Days;
 public StepTracker(int num){
 numSteps=0;
 stepMin= num;
 Days= new ArrayList<>();
 }
 public void addDailySteps(int z){
 Days.add(z);
 }
 public int activeDays(){
  int count=0;
   for(int i=0; i<Days.size();i++)
    if(Days.get(i)>=stepMin)
     count++;
   return count;
 }
 public double averageSteps(){
  int count=0;
   for(int i=0; i<Days.size();i++)
    count+=Days.get(i);
  return count/Days.size();
} 
}
