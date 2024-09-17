import java.util.Scanner;
public class DisruptLecture{
    private String disruptionReason;
}
public DisruptLecture(String Reason){
    this.disruptionReason = Reason;
}
public void ReportDisruption(){
    System.out.println("Disruption reported: " + disruptionReason)
}
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in)
    System.out.print(Enter the reason for disruption: )
    String reason = scanner.nextLine();
    DisruptLecture lecture = new DisruptLecture(reason);
    lecture.reportDisruption();
}