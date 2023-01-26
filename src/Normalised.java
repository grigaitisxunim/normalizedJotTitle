import java.util.HashMap;
public class Normalised {


    private static HashMap<String, String> jobTitles;

    static {
        jobTitles = new HashMap<>();
        jobTitles.put("Java engineer", "Software Engineer");
        jobTitles.put("C# engineer", "Software Engineer");
        jobTitles.put("JavaScript", "Software Engineer");
        jobTitles.put("Chief Accountant", "Accountant");
        jobTitles.put("Accountant", "Accountant");
        // adicionar mais cargos e seus respectivos padrões aqui
    }

    public static String normalise(String jobTitle) {
        return jobTitles.get(jobTitle);
    }
}


