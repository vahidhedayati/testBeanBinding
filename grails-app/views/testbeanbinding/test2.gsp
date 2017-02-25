<g:form action="test3">
<g:textField name="childName" value="${instance.childName}"/>
<g:textField name="updatedParent.parentName" value="${updatedParent.parentName}"/>
<g:textField name="updatedParent.address" value="${updatedParent.address}"/>
<g:submitButton name="submit"/>
</g:form>