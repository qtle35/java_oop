package codedevl;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Thisinh1 {
    private String name, start, end;

    public Thisinh1(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    public long getDiffTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d1 = LocalDateTime.parse(start, dtf);
        LocalDateTime d2 = LocalDateTime.parse(end, dtf);
        return ChronoUnit.MINUTES.between(d1, d2);
    }
    
    @Override
    public String toString() {
        return name + " " + getDiffTime();
    }
}
public class j07084thoigianonline {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<Thisinh1> list = new ArrayList<>();
        
        int t = sc.nextInt();
        sc.nextLine();
        for (int test = 1; test <= t; test++) {
            Thisinh1 Thisinh = new Thisinh1(sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(Thisinh);
        }
        
        Collections.sort(list, Comparator
                .comparing(Thisinh1:: getDiffTime, Comparator.reverseOrder()));
        
        for (Thisinh1 thiSinh : list)
            System.out.println(thiSinh);

    }
}
