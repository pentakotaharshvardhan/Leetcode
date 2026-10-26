/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> hm=new HashMap<>();
        for(int i=0;i<employees.size();i++){
            hm.put(employees.get(i).id,employees.get(i));
        }
        int ans=0;
        Queue<Integer> que=new LinkedList<>();
        que.add(id);
        if(!hm.containsKey(id)) return 0; 
        while(!que.isEmpty()){
            int ixd=que.poll();
            Employee emp=hm.get(ixd);
            ans+=emp.importance;
            List<Integer> ls=emp.subordinates;
            for(int i:ls) que.add(i);
        }
        return ans;
    }
}