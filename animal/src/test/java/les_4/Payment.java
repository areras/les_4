package les_4;

class Payment {
    public List list;

    class List {
        private String checklist;

        public List(String checklist) {
            this.checklist = checklist;
        }

        public void setChecklist(String point) {
            checklist = checklist + "\n" + "* " + point;
        }
        public String getChecklist (){
            System.out.print(checklist);
            return checklist;
        }

    }
}

