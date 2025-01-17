package sample;

public class MedalFactory {
    private Employee[] employees;

    public MedalFactory(Employee[] employees) {
        this.employees = employees;
    }

    public Medal[] makeMedal(Material[] materials) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        Medal[] medals = new Medal[materials.length];
        for (int i = 0; i < materials.length; i++) {
            String materialName = materials[i].getName();
            int cost = materials[i].getCost();
            String medalName;
            int price;

            switch (materialName) {
                case "金":
                    medalName = "金メダル";
                    price = cost + (int) ((totalSalary / (double) materials.length) * 1.2);
                    break;
                case "銀":
                    medalName = "銀メダル";
                    price = cost + (int) ((totalSalary / (double) materials.length) * 1.2);
                    break;
                case "銅":
                    medalName = "銅メダル";
                    price = cost + (int) ((totalSalary / (double) materials.length) * 1.2);
                    break;
                default:
                    medalName = "不良品";
                    price = 0;
                    break;
            }

            medals[i] = new Medal(medalName, price);
        }

        return medals;
    }
}
