//207 Course Schedule
//1115

//time limit exceeded for Topological Sorting
import java.util.ArrayList;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graphs = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) graphs[i] = new ArrayList();
        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < prerequisites.length; i++) graphs[prerequisites[i][1]].add(prerequisites[i][0]); //mark as visited?
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graphs, visited, i)) return false;
        }
        return true;
    }

    private boolean dfs(ArrayList[] graphs, boolean[] visited, int course) {
        if (visited[course]) return false;
        else visited[course] = true;

        for (int i = 0; i < graphs[course].size(); i++) {
            if (!dfs(graphs, visited, (Integer) graphs[course].get(i))) return false;
        }
        visited[course] = false;
        return true;
    }

    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        int numCourses = 3;
        int[][] prerequisites = {{1, 2}, {0, 1}, {0, 2}};
        System.out.println(cs.canFinish(numCourses, prerequisites));
    }
}

