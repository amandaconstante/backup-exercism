class Badge {
    public String print(Integer id, String name, String department) {
        String idStr = id != null ? "[" + id + "] - " : "";
        String finalDepartment = department != null ? department : "owner";
        return idStr + name + " - " + finalDepartment.toUpperCase();
    }
}
