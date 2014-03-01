package com.phloc.html.markdown;

import javax.annotation.Nonnull;

public class MarkdownException extends RuntimeException
{
  public MarkdownException (@Nonnull final String sMessage)
  {
    super (sMessage);
  }
}
