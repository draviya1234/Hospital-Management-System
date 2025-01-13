class staff {
        String id;
        String name;
        String position;
        double salary;
    
        public staff(String id, String name, String position, double salary) {
            this.id = id;
            this.name = name;
            this.position = position;
            this.salary = salary;
        }
    
        @Override
        public String toString() {
            return "Staff [ID=" + id + ", Name=" + name + ", Position=" + position + ", Salary=" + salary + "]";
        }
    }
    
    

