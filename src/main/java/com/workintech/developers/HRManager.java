package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Geçersiz index. JuniorDeveloper eklenemedi.");
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("Bu index dolu. JuniorDeveloper eklenemedi.");
            return;
        }

        juniorDevelopers[index] = juniorDeveloper;
        System.out.println("JuniorDeveloper eklendi.");
    }

    public void addEmployee(MidDeveloper midDeveloper, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Geçersiz index. MidDeveloper eklenemedi.");
            return;
        }

        if (midDevelopers[index] != null) {
            System.out.println("Bu index dolu. MidDeveloper eklenemedi.");
            return;
        }

        midDevelopers[index] = midDeveloper;
        System.out.println("MidDeveloper eklendi.");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Geçersiz index. SeniorDeveloper eklenemedi.");
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("Bu index dolu. SeniorDeveloper eklenemedi.");
            return;
        }

        seniorDevelopers[index] = seniorDeveloper;
        System.out.println("SeniorDeveloper eklendi.");
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 1000);
    }
}
