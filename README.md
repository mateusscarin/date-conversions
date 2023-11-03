# Date Conversions

Repositório com intuito de prover com didática simples, conversões e manipulações entre tipos de datas em Java.

## Date

[Doc: java.util.Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

#### Convertendo _java.util.LocalDate_ -> _java.utilDate_

```java
  public Date converterViaLocalDate(LocalDate localDate) {
    return java.sql.Date.valueOf(localDate);
}
```

```java
public Date converterViaLocalDate(LocalDate localDate) {
    return java.util.Date.from(localDate.atStartOfDay()
      .atZone(ZoneId.systemDefault())
      .toInstant());
}
```

#### Convertendo _java.util.LocalDateTime_ -> _java.utilDate_

```java
public Date converterViaLocalDateTime(LocalDateTime localDateTime) {
    return java.sql.Timestamp.valueOf(localDateTime);
}
```

```java
public Date converterViaLocalDateTime(LocalDateTime localDateTime) {
    return java.util.Date
      .from(localDateTime.atZone(ZoneId.systemDefault())
      .toInstant());
}
```

## LocalDate

[Doc: java.util.LocalDate](https://docs.oracle.com/javase/8/docs/api/java/util/LocalDate.html)

#### Convertendo _java.util.Date_ -> _java.util.LocalDate_

```java
public LocalDate converterViaDate(Date date) {
    return date.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}
```

```java
public LocalDate converterViaDate(Date date) {
    return Instant.ofEpochMilli(date.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}
```

## LocalTime

[Doc: java.util.LocalTime](https://docs.oracle.com/javase/8/docs/api/java/util/LocalTime.html)

#### Convertendo _java.util.Date_ -> _java.util.LocalTime_

```java
public LocalTime converterViaDate(Date date) {
    return date.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalTime();
}
```

```java
public LocalTime converterViaDate(Date date) {
    return Instant.ofEpochMilli(date.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalTime();
}
```

## LocalDateTime

[Doc: java.util.LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/util/LocalDateTime.html)

#### Convertendo _java.util.Date_ -> _java.util.LocalDateTime_

```java
public LocalDateTime converterViaDate(Date date) {
    return date.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
```

```java
public LocalDateTime converterViaDate(Date date) {
    return Instant.ofEpochMilli(date.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
```

## Referências

<https://www.baeldung.com/java-date-to-localdate-and-localdatetime>
