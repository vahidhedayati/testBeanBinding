package testbeanbinding

class Parent {

    String parentName
    String address

    static constraints = {
    }
    int hashCode() {
        final int prime = 31
        int result = 1
        result = prime * result + (parentName?.hashCode()?:0)
        result = prime * result + (address?.hashCode()?:0)
        return result
    }
}
