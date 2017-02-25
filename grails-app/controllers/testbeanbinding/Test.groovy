package testbeanbinding

class Test {

    def test(ParentBean bean) {
        render view:'test', model:[instance:bean]
    }
    def test2(ChildBean bean) {
        render view:'test2', model:[instance:bean]
    }
    def test3(ChildBean bean) {
      //save bean and now you have old request new updated request and content of anything within childBean itself
        //it is probably the best way of managing this....
    }

}
