import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello! I am Vaya.");
        System.out.println("Your AI Voice Lead Agent is starting...");

        String systemPrompt = Files.readString(Paths.get("prompts/system_prompt.txt"));
        String conversationFlow = Files.readString(Paths.get("docs/conversation_flow.md"));
        String companyKnowledge = Files.readString(Paths.get("data/company_knowledge.md"));
        String aiContext = systemPrompt + "\n\n"
                 + conversationFlow + "\n\n"
                 + companyKnowledge;
        System.out.println(aiContext);
    }
}