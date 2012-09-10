/**
 * Copyright (C) 2006-2012 phloc systems
 * http://www.phloc.com
 * office[at]phloc[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.phloc.html.hc.html5;

import java.util.Date;

import javax.annotation.CheckForSigned;
import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;

import com.phloc.commons.math.MathHelper;
import com.phloc.commons.microdom.IMicroElement;
import com.phloc.commons.string.StringHelper;
import com.phloc.commons.typeconvert.TypeConverter;
import com.phloc.html.CHTMLAttributes;
import com.phloc.html.EHTMLElement;
import com.phloc.html.annotations.SinceHTML5;
import com.phloc.html.hc.conversion.IHCConversionSettings;
import com.phloc.html.hc.impl.AbstractHCElementWithChildren;

@SinceHTML5
public class HCTime extends AbstractHCElementWithChildren <HCTime>
{
  private String m_sDatetime;

  public HCTime ()
  {
    super (EHTMLElement.TIME);
  }

  @Nullable
  public String getDatetime ()
  {
    return m_sDatetime;
  }

  @Nonnull
  public HCTime setAsMonth (@Nonnegative final int nYear, @Nonnegative final int nMonth)
  {
    m_sDatetime = StringHelper.getLeadingZero (nYear, 4) + "-" + StringHelper.getLeadingZero (nMonth, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsDate (@Nonnegative final int nYear, @Nonnegative final int nMonth, @Nonnegative final int nDay)
  {
    m_sDatetime = StringHelper.getLeadingZero (nYear, 4) +
                  "-" +
                  StringHelper.getLeadingZero (nMonth, 2) +
                  "-" +
                  StringHelper.getLeadingZero (nDay, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsDate (@Nonnull final LocalDate aDate)
  {
    m_sDatetime = ISODateTimeFormat.yearMonthDay ().print (aDate);
    return this;
  }

  @Nonnull
  public HCTime setAsDate (@Nonnull final Date aDate)
  {
    return setAsDate (TypeConverter.convertIfNecessary (aDate, LocalDate.class));
  }

  @Nonnull
  public HCTime setAsYearlessDate (@Nonnegative final int nMonth, @Nonnegative final int nDay)
  {
    m_sDatetime = StringHelper.getLeadingZero (nMonth, 2) + "-" + StringHelper.getLeadingZero (nDay, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsTime (@Nonnegative final int nHour, @Nonnegative final int nMinute)
  {
    m_sDatetime = StringHelper.getLeadingZero (nHour, 2) + ":" + StringHelper.getLeadingZero (nMinute, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsTime (@Nonnegative final int nHour, @Nonnegative final int nMinute, @Nonnegative final int nSecond)
  {
    m_sDatetime = StringHelper.getLeadingZero (nHour, 2) +
                  ":" +
                  StringHelper.getLeadingZero (nMinute, 2) +
                  ":" +
                  StringHelper.getLeadingZero (nSecond, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsTime (@Nonnegative final int nHour,
                           @Nonnegative final int nMinute,
                           @Nonnegative final int nSecond,
                           @Nonnegative final int nMilliSeconds)
  {
    m_sDatetime = StringHelper.getLeadingZero (nHour, 2) +
                  ":" +
                  StringHelper.getLeadingZero (nMinute, 2) +
                  ":" +
                  StringHelper.getLeadingZero (nSecond, 2) +
                  "." +
                  nMilliSeconds;
    return this;
  }

  @Nonnull
  public HCTime setAsTime (@Nonnull final LocalTime aTime)
  {
    m_sDatetime = ISODateTimeFormat.hourMinuteSecondMillis ().print (aTime);
    return this;
  }

  @Nonnull
  public HCTime setAsTime (@Nonnull final Date aDate)
  {
    return setAsTime (TypeConverter.convertIfNecessary (aDate, LocalTime.class));
  }

  @Nonnull
  public HCTime setAsDateAndTime (@Nonnull final LocalDateTime aDateTime)
  {
    m_sDatetime = ISODateTimeFormat.dateTime ().print (aDateTime);
    return this;
  }

  @Nonnull
  public HCTime setAsDateAndTime (@Nonnull final DateTime aDateTime)
  {
    m_sDatetime = ISODateTimeFormat.dateTime ().print (aDateTime);
    return this;
  }

  @Nonnull
  public HCTime setAsTimezone (@CheckForSigned final int nMinutes)
  {
    final int nHours = nMinutes / 60;
    final int nRestMinutes = nMinutes % 60;
    m_sDatetime = (nHours < 0 ? "-" : "+") +
                  StringHelper.getLeadingZero (MathHelper.abs (nHours), 2) +
                  ":" +
                  StringHelper.getLeadingZero (MathHelper.abs (nRestMinutes), 2);
    return this;
  }

  @Nonnull
  public HCTime setAsWeekInYear (@Nonnegative final int nYear, @Nonnegative final int nWeekInYear)
  {
    m_sDatetime = StringHelper.getLeadingZero (nYear, 4) + "-W" + StringHelper.getLeadingZero (nWeekInYear, 2);
    return this;
  }

  @Nonnull
  public HCTime setAsYear (@Nonnegative final int nYear)
  {
    m_sDatetime = StringHelper.getLeadingZero (nYear, 4);
    return this;
  }

  @Nonnull
  public HCTime setAsDuration (@Nonnull final Duration aDuration)
  {
    return setAsDuration (aDuration.toPeriod ());
  }

  @Nonnull
  public HCTime setAsDuration (@Nonnull final Period aPeriod)
  {
    m_sDatetime = ISOPeriodFormat.standard ().print (aPeriod);
    return this;
  }

  @Override
  protected void applyProperties (final IMicroElement aElement, final IHCConversionSettings aConversionSettings)
  {
    super.applyProperties (aElement, aConversionSettings);
    if (StringHelper.hasText (m_sDatetime))
      aElement.setAttribute (CHTMLAttributes.DATETIME, m_sDatetime);
  }
}
