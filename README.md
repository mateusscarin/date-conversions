# Date Conversions

Repositório com intuito de prover com didática simples, conversões e manipulações entre tipos de datas em Java.

## Date

[Doc: java.util.Date](https://docs.oracle.com/javase/8/docs/api/java/util/Date.html)

#### Convertendo _java.time.LocalDate_ -> _java.util.Date_

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

#### Convertendo _java.time.LocalTime_ -> _java.util.Date_

```java
  public static Date converterViaLocalTime(LocalTime localTime) {
    Instant instant = localTime.atDate(LocalDate.of(2023, 06, 24))
            .atZone(ZoneId.systemDefault())
            .toInstant();
    return Date.from(instant);
  }
```

#### Convertendo _java.time.LocalDateTime_ -> _java.util.Date_

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

[Doc: java.time.LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)

#### Convertendo _java.util.Date_ -> _java.time.LocalDate_

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

[Doc: java.time.LocalTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)

#### Convertendo _java.util.Date_ -> _java.time.LocalTime_

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

[Doc: java.time.LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)

#### Convertendo _java.util.Date_ -> _java.time.LocalDateTime_

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
<https://stackoverflow.com/questions/33098603/convert-localtime-java-8-to-date>
