
class patient {
    String id;
    String name;
    int age;
    String address;
    String phone;

    public patient(String id, String name, int age, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return "patient [ID=" + id + ", Name=" + name + ", Age=" + age + ", Address=" + address + ", Phone=" + phone + "]";
    }
}

    

