Создать собственные аннотации @MapKeyFail и @MapValueFail. Создать runtime исключения MapKeyFailException и MapValueFailException. Расширить класс HashMap<Object, Object> таким образом, что:

* если в метод put поступает ключ, отмеченный аннотацией @MapKeyFail, выбрасывается MapKeyFailException.
* если в метод put поступает значение, отмеченное аннотацией @MapValueFail, выбрасывается MapValueFailException.
