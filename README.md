# Date Conversions

Repositório com intuito de prover com didática simples conversões e manipulações entre tipos de datas em Java.

## Date

[Link documentação](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

#### Convertendo _java.util.Date_ -> _java.util.LocalDate_

```java
public LocalDate convertToLocalDate(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}
```

```java
public LocalDate convertToLocalDate(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}
```

#### Convertendo _java.util.Date_ -> _java.util.LocalTime_

```java
public LocalTime convertToLocalTime(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalTime();
}
```

```java
public LocalTime convertToLocalTime(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalTime();
}
```

#### Convertendo _java.util.Date_ -> _java.util.LocalDateTime_

```java
public LocalDateTime convertToLocalDateTime(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
```

```java
public LocalDateTime convertToLocalDateTime(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
```

## LocalDate

## Referências
https://www.baeldung.com/java-date-to-localdate-and-localdatetime
