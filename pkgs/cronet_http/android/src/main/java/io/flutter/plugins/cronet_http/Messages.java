// Autogenerated from Pigeon (v3.2.3), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.cronet_http;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class Messages {

  public enum CacheMode {
    disabled(0),
    memory(1),
    diskNoHttp(2),
    disk(3);

    private int index;
    private CacheMode(final int index) {
      this.index = index;
    }
  }

  public enum ExceptionType {
    illegalArgumentException(0),
    otherException(1);

    private int index;
    private ExceptionType(final int index) {
      this.index = index;
    }
  }

  public enum EventMessageType {
    responseStarted(0),
    readCompleted(1),
    tooManyRedirects(2);

    private int index;
    private EventMessageType(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class ResponseStarted {
    private @NonNull Map<String, List<String>> headers;
    public @NonNull Map<String, List<String>> getHeaders() { return headers; }
    public void setHeaders(@NonNull Map<String, List<String>> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"headers\" is null.");
      }
      this.headers = setterArg;
    }

    private @NonNull Long statusCode;
    public @NonNull Long getStatusCode() { return statusCode; }
    public void setStatusCode(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"statusCode\" is null.");
      }
      this.statusCode = setterArg;
    }

    private @NonNull Boolean isRedirect;
    public @NonNull Boolean getIsRedirect() { return isRedirect; }
    public void setIsRedirect(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"isRedirect\" is null.");
      }
      this.isRedirect = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private ResponseStarted() {}
    public static final class Builder {
      private @Nullable Map<String, List<String>> headers;
      public @NonNull Builder setHeaders(@NonNull Map<String, List<String>> setterArg) {
        this.headers = setterArg;
        return this;
      }
      private @Nullable Long statusCode;
      public @NonNull Builder setStatusCode(@NonNull Long setterArg) {
        this.statusCode = setterArg;
        return this;
      }
      private @Nullable Boolean isRedirect;
      public @NonNull Builder setIsRedirect(@NonNull Boolean setterArg) {
        this.isRedirect = setterArg;
        return this;
      }
      public @NonNull ResponseStarted build() {
        ResponseStarted pigeonReturn = new ResponseStarted();
        pigeonReturn.setHeaders(headers);
        pigeonReturn.setStatusCode(statusCode);
        pigeonReturn.setIsRedirect(isRedirect);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("headers", headers);
      toMapResult.put("statusCode", statusCode);
      toMapResult.put("isRedirect", isRedirect);
      return toMapResult;
    }
    static @NonNull ResponseStarted fromMap(@NonNull Map<String, Object> map) {
      ResponseStarted pigeonResult = new ResponseStarted();
      Object headers = map.get("headers");
      pigeonResult.setHeaders((Map<String, List<String>>)headers);
      Object statusCode = map.get("statusCode");
      pigeonResult.setStatusCode((statusCode == null) ? null : ((statusCode instanceof Integer) ? (Integer)statusCode : (Long)statusCode));
      Object isRedirect = map.get("isRedirect");
      pigeonResult.setIsRedirect((Boolean)isRedirect);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class ReadCompleted {
    private @NonNull byte[] data;
    public @NonNull byte[] getData() { return data; }
    public void setData(@NonNull byte[] setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"data\" is null.");
      }
      this.data = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private ReadCompleted() {}
    public static final class Builder {
      private @Nullable byte[] data;
      public @NonNull Builder setData(@NonNull byte[] setterArg) {
        this.data = setterArg;
        return this;
      }
      public @NonNull ReadCompleted build() {
        ReadCompleted pigeonReturn = new ReadCompleted();
        pigeonReturn.setData(data);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("data", data);
      return toMapResult;
    }
    static @NonNull ReadCompleted fromMap(@NonNull Map<String, Object> map) {
      ReadCompleted pigeonResult = new ReadCompleted();
      Object data = map.get("data");
      pigeonResult.setData((byte[])data);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class EventMessage {
    private @NonNull EventMessageType type;
    public @NonNull EventMessageType getType() { return type; }
    public void setType(@NonNull EventMessageType setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"type\" is null.");
      }
      this.type = setterArg;
    }

    private @Nullable ResponseStarted responseStarted;
    public @Nullable ResponseStarted getResponseStarted() { return responseStarted; }
    public void setResponseStarted(@Nullable ResponseStarted setterArg) {
      this.responseStarted = setterArg;
    }

    private @Nullable ReadCompleted readCompleted;
    public @Nullable ReadCompleted getReadCompleted() { return readCompleted; }
    public void setReadCompleted(@Nullable ReadCompleted setterArg) {
      this.readCompleted = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private EventMessage() {}
    public static final class Builder {
      private @Nullable EventMessageType type;
      public @NonNull Builder setType(@NonNull EventMessageType setterArg) {
        this.type = setterArg;
        return this;
      }
      private @Nullable ResponseStarted responseStarted;
      public @NonNull Builder setResponseStarted(@Nullable ResponseStarted setterArg) {
        this.responseStarted = setterArg;
        return this;
      }
      private @Nullable ReadCompleted readCompleted;
      public @NonNull Builder setReadCompleted(@Nullable ReadCompleted setterArg) {
        this.readCompleted = setterArg;
        return this;
      }
      public @NonNull EventMessage build() {
        EventMessage pigeonReturn = new EventMessage();
        pigeonReturn.setType(type);
        pigeonReturn.setResponseStarted(responseStarted);
        pigeonReturn.setReadCompleted(readCompleted);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("type", type == null ? null : type.index);
      toMapResult.put("responseStarted", (responseStarted == null) ? null : responseStarted.toMap());
      toMapResult.put("readCompleted", (readCompleted == null) ? null : readCompleted.toMap());
      return toMapResult;
    }
    static @NonNull EventMessage fromMap(@NonNull Map<String, Object> map) {
      EventMessage pigeonResult = new EventMessage();
      Object type = map.get("type");
      pigeonResult.setType(type == null ? null : EventMessageType.values()[(int)type]);
      Object responseStarted = map.get("responseStarted");
      pigeonResult.setResponseStarted((responseStarted == null) ? null : ResponseStarted.fromMap((Map)responseStarted));
      Object readCompleted = map.get("readCompleted");
      pigeonResult.setReadCompleted((readCompleted == null) ? null : ReadCompleted.fromMap((Map)readCompleted));
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CreateEngineRequest {
    private @Nullable CacheMode cacheMode;
    public @Nullable CacheMode getCacheMode() { return cacheMode; }
    public void setCacheMode(@Nullable CacheMode setterArg) {
      this.cacheMode = setterArg;
    }

    private @Nullable Long cacheMaxSize;
    public @Nullable Long getCacheMaxSize() { return cacheMaxSize; }
    public void setCacheMaxSize(@Nullable Long setterArg) {
      this.cacheMaxSize = setterArg;
    }

    private @Nullable Boolean enableBrotli;
    public @Nullable Boolean getEnableBrotli() { return enableBrotli; }
    public void setEnableBrotli(@Nullable Boolean setterArg) {
      this.enableBrotli = setterArg;
    }

    private @Nullable Boolean enableHttp2;
    public @Nullable Boolean getEnableHttp2() { return enableHttp2; }
    public void setEnableHttp2(@Nullable Boolean setterArg) {
      this.enableHttp2 = setterArg;
    }

    private @Nullable Boolean enablePublicKeyPinningBypassForLocalTrustAnchors;
    public @Nullable Boolean getEnablePublicKeyPinningBypassForLocalTrustAnchors() { return enablePublicKeyPinningBypassForLocalTrustAnchors; }
    public void setEnablePublicKeyPinningBypassForLocalTrustAnchors(@Nullable Boolean setterArg) {
      this.enablePublicKeyPinningBypassForLocalTrustAnchors = setterArg;
    }

    private @Nullable Boolean enableQuic;
    public @Nullable Boolean getEnableQuic() { return enableQuic; }
    public void setEnableQuic(@Nullable Boolean setterArg) {
      this.enableQuic = setterArg;
    }

    private @Nullable String storagePath;
    public @Nullable String getStoragePath() { return storagePath; }
    public void setStoragePath(@Nullable String setterArg) {
      this.storagePath = setterArg;
    }

    private @Nullable String userAgent;
    public @Nullable String getUserAgent() { return userAgent; }
    public void setUserAgent(@Nullable String setterArg) {
      this.userAgent = setterArg;
    }

    public static final class Builder {
      private @Nullable CacheMode cacheMode;
      public @NonNull Builder setCacheMode(@Nullable CacheMode setterArg) {
        this.cacheMode = setterArg;
        return this;
      }
      private @Nullable Long cacheMaxSize;
      public @NonNull Builder setCacheMaxSize(@Nullable Long setterArg) {
        this.cacheMaxSize = setterArg;
        return this;
      }
      private @Nullable Boolean enableBrotli;
      public @NonNull Builder setEnableBrotli(@Nullable Boolean setterArg) {
        this.enableBrotli = setterArg;
        return this;
      }
      private @Nullable Boolean enableHttp2;
      public @NonNull Builder setEnableHttp2(@Nullable Boolean setterArg) {
        this.enableHttp2 = setterArg;
        return this;
      }
      private @Nullable Boolean enablePublicKeyPinningBypassForLocalTrustAnchors;
      public @NonNull Builder setEnablePublicKeyPinningBypassForLocalTrustAnchors(@Nullable Boolean setterArg) {
        this.enablePublicKeyPinningBypassForLocalTrustAnchors = setterArg;
        return this;
      }
      private @Nullable Boolean enableQuic;
      public @NonNull Builder setEnableQuic(@Nullable Boolean setterArg) {
        this.enableQuic = setterArg;
        return this;
      }
      private @Nullable String storagePath;
      public @NonNull Builder setStoragePath(@Nullable String setterArg) {
        this.storagePath = setterArg;
        return this;
      }
      private @Nullable String userAgent;
      public @NonNull Builder setUserAgent(@Nullable String setterArg) {
        this.userAgent = setterArg;
        return this;
      }
      public @NonNull CreateEngineRequest build() {
        CreateEngineRequest pigeonReturn = new CreateEngineRequest();
        pigeonReturn.setCacheMode(cacheMode);
        pigeonReturn.setCacheMaxSize(cacheMaxSize);
        pigeonReturn.setEnableBrotli(enableBrotli);
        pigeonReturn.setEnableHttp2(enableHttp2);
        pigeonReturn.setEnablePublicKeyPinningBypassForLocalTrustAnchors(enablePublicKeyPinningBypassForLocalTrustAnchors);
        pigeonReturn.setEnableQuic(enableQuic);
        pigeonReturn.setStoragePath(storagePath);
        pigeonReturn.setUserAgent(userAgent);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("cacheMode", cacheMode == null ? null : cacheMode.index);
      toMapResult.put("cacheMaxSize", cacheMaxSize);
      toMapResult.put("enableBrotli", enableBrotli);
      toMapResult.put("enableHttp2", enableHttp2);
      toMapResult.put("enablePublicKeyPinningBypassForLocalTrustAnchors", enablePublicKeyPinningBypassForLocalTrustAnchors);
      toMapResult.put("enableQuic", enableQuic);
      toMapResult.put("storagePath", storagePath);
      toMapResult.put("userAgent", userAgent);
      return toMapResult;
    }
    static @NonNull CreateEngineRequest fromMap(@NonNull Map<String, Object> map) {
      CreateEngineRequest pigeonResult = new CreateEngineRequest();
      Object cacheMode = map.get("cacheMode");
      pigeonResult.setCacheMode(cacheMode == null ? null : CacheMode.values()[(int)cacheMode]);
      Object cacheMaxSize = map.get("cacheMaxSize");
      pigeonResult.setCacheMaxSize((cacheMaxSize == null) ? null : ((cacheMaxSize instanceof Integer) ? (Integer)cacheMaxSize : (Long)cacheMaxSize));
      Object enableBrotli = map.get("enableBrotli");
      pigeonResult.setEnableBrotli((Boolean)enableBrotli);
      Object enableHttp2 = map.get("enableHttp2");
      pigeonResult.setEnableHttp2((Boolean)enableHttp2);
      Object enablePublicKeyPinningBypassForLocalTrustAnchors = map.get("enablePublicKeyPinningBypassForLocalTrustAnchors");
      pigeonResult.setEnablePublicKeyPinningBypassForLocalTrustAnchors((Boolean)enablePublicKeyPinningBypassForLocalTrustAnchors);
      Object enableQuic = map.get("enableQuic");
      pigeonResult.setEnableQuic((Boolean)enableQuic);
      Object storagePath = map.get("storagePath");
      pigeonResult.setStoragePath((String)storagePath);
      Object userAgent = map.get("userAgent");
      pigeonResult.setUserAgent((String)userAgent);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CreateEngineResponse {
    private @Nullable String engineId;
    public @Nullable String getEngineId() { return engineId; }
    public void setEngineId(@Nullable String setterArg) {
      this.engineId = setterArg;
    }

    private @Nullable String errorString;
    public @Nullable String getErrorString() { return errorString; }
    public void setErrorString(@Nullable String setterArg) {
      this.errorString = setterArg;
    }

    private @Nullable ExceptionType errorType;
    public @Nullable ExceptionType getErrorType() { return errorType; }
    public void setErrorType(@Nullable ExceptionType setterArg) {
      this.errorType = setterArg;
    }

    public static final class Builder {
      private @Nullable String engineId;
      public @NonNull Builder setEngineId(@Nullable String setterArg) {
        this.engineId = setterArg;
        return this;
      }
      private @Nullable String errorString;
      public @NonNull Builder setErrorString(@Nullable String setterArg) {
        this.errorString = setterArg;
        return this;
      }
      private @Nullable ExceptionType errorType;
      public @NonNull Builder setErrorType(@Nullable ExceptionType setterArg) {
        this.errorType = setterArg;
        return this;
      }
      public @NonNull CreateEngineResponse build() {
        CreateEngineResponse pigeonReturn = new CreateEngineResponse();
        pigeonReturn.setEngineId(engineId);
        pigeonReturn.setErrorString(errorString);
        pigeonReturn.setErrorType(errorType);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("engineId", engineId);
      toMapResult.put("errorString", errorString);
      toMapResult.put("errorType", errorType == null ? null : errorType.index);
      return toMapResult;
    }
    static @NonNull CreateEngineResponse fromMap(@NonNull Map<String, Object> map) {
      CreateEngineResponse pigeonResult = new CreateEngineResponse();
      Object engineId = map.get("engineId");
      pigeonResult.setEngineId((String)engineId);
      Object errorString = map.get("errorString");
      pigeonResult.setErrorString((String)errorString);
      Object errorType = map.get("errorType");
      pigeonResult.setErrorType(errorType == null ? null : ExceptionType.values()[(int)errorType]);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class StartRequest {
    private @NonNull String engineId;
    public @NonNull String getEngineId() { return engineId; }
    public void setEngineId(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"engineId\" is null.");
      }
      this.engineId = setterArg;
    }

    private @NonNull String url;
    public @NonNull String getUrl() { return url; }
    public void setUrl(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"url\" is null.");
      }
      this.url = setterArg;
    }

    private @NonNull String method;
    public @NonNull String getMethod() { return method; }
    public void setMethod(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"method\" is null.");
      }
      this.method = setterArg;
    }

    private @NonNull Map<String, String> headers;
    public @NonNull Map<String, String> getHeaders() { return headers; }
    public void setHeaders(@NonNull Map<String, String> setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"headers\" is null.");
      }
      this.headers = setterArg;
    }

    private @NonNull byte[] body;
    public @NonNull byte[] getBody() { return body; }
    public void setBody(@NonNull byte[] setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"body\" is null.");
      }
      this.body = setterArg;
    }

    private @NonNull Long maxRedirects;
    public @NonNull Long getMaxRedirects() { return maxRedirects; }
    public void setMaxRedirects(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"maxRedirects\" is null.");
      }
      this.maxRedirects = setterArg;
    }

    private @NonNull Boolean followRedirects;
    public @NonNull Boolean getFollowRedirects() { return followRedirects; }
    public void setFollowRedirects(@NonNull Boolean setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"followRedirects\" is null.");
      }
      this.followRedirects = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private StartRequest() {}
    public static final class Builder {
      private @Nullable String engineId;
      public @NonNull Builder setEngineId(@NonNull String setterArg) {
        this.engineId = setterArg;
        return this;
      }
      private @Nullable String url;
      public @NonNull Builder setUrl(@NonNull String setterArg) {
        this.url = setterArg;
        return this;
      }
      private @Nullable String method;
      public @NonNull Builder setMethod(@NonNull String setterArg) {
        this.method = setterArg;
        return this;
      }
      private @Nullable Map<String, String> headers;
      public @NonNull Builder setHeaders(@NonNull Map<String, String> setterArg) {
        this.headers = setterArg;
        return this;
      }
      private @Nullable byte[] body;
      public @NonNull Builder setBody(@NonNull byte[] setterArg) {
        this.body = setterArg;
        return this;
      }
      private @Nullable Long maxRedirects;
      public @NonNull Builder setMaxRedirects(@NonNull Long setterArg) {
        this.maxRedirects = setterArg;
        return this;
      }
      private @Nullable Boolean followRedirects;
      public @NonNull Builder setFollowRedirects(@NonNull Boolean setterArg) {
        this.followRedirects = setterArg;
        return this;
      }
      public @NonNull StartRequest build() {
        StartRequest pigeonReturn = new StartRequest();
        pigeonReturn.setEngineId(engineId);
        pigeonReturn.setUrl(url);
        pigeonReturn.setMethod(method);
        pigeonReturn.setHeaders(headers);
        pigeonReturn.setBody(body);
        pigeonReturn.setMaxRedirects(maxRedirects);
        pigeonReturn.setFollowRedirects(followRedirects);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("engineId", engineId);
      toMapResult.put("url", url);
      toMapResult.put("method", method);
      toMapResult.put("headers", headers);
      toMapResult.put("body", body);
      toMapResult.put("maxRedirects", maxRedirects);
      toMapResult.put("followRedirects", followRedirects);
      return toMapResult;
    }
    static @NonNull StartRequest fromMap(@NonNull Map<String, Object> map) {
      StartRequest pigeonResult = new StartRequest();
      Object engineId = map.get("engineId");
      pigeonResult.setEngineId((String)engineId);
      Object url = map.get("url");
      pigeonResult.setUrl((String)url);
      Object method = map.get("method");
      pigeonResult.setMethod((String)method);
      Object headers = map.get("headers");
      pigeonResult.setHeaders((Map<String, String>)headers);
      Object body = map.get("body");
      pigeonResult.setBody((byte[])body);
      Object maxRedirects = map.get("maxRedirects");
      pigeonResult.setMaxRedirects((maxRedirects == null) ? null : ((maxRedirects instanceof Integer) ? (Integer)maxRedirects : (Long)maxRedirects));
      Object followRedirects = map.get("followRedirects");
      pigeonResult.setFollowRedirects((Boolean)followRedirects);
      return pigeonResult;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class StartResponse {
    private @NonNull String eventChannel;
    public @NonNull String getEventChannel() { return eventChannel; }
    public void setEventChannel(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"eventChannel\" is null.");
      }
      this.eventChannel = setterArg;
    }

    /** Constructor is private to enforce null safety; use Builder. */
    private StartResponse() {}
    public static final class Builder {
      private @Nullable String eventChannel;
      public @NonNull Builder setEventChannel(@NonNull String setterArg) {
        this.eventChannel = setterArg;
        return this;
      }
      public @NonNull StartResponse build() {
        StartResponse pigeonReturn = new StartResponse();
        pigeonReturn.setEventChannel(eventChannel);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("eventChannel", eventChannel);
      return toMapResult;
    }
    static @NonNull StartResponse fromMap(@NonNull Map<String, Object> map) {
      StartResponse pigeonResult = new StartResponse();
      Object eventChannel = map.get("eventChannel");
      pigeonResult.setEventChannel((String)eventChannel);
      return pigeonResult;
    }
  }
  private static class HttpApiCodec extends StandardMessageCodec {
    public static final HttpApiCodec INSTANCE = new HttpApiCodec();
    private HttpApiCodec() {}
    @Override
    protected Object readValueOfType(byte type, ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return CreateEngineRequest.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)129:         
          return CreateEngineResponse.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)130:         
          return EventMessage.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)131:         
          return ReadCompleted.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)132:         
          return ResponseStarted.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)133:         
          return StartRequest.fromMap((Map<String, Object>) readValue(buffer));
        
        case (byte)134:         
          return StartResponse.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(ByteArrayOutputStream stream, Object value)     {
      if (value instanceof CreateEngineRequest) {
        stream.write(128);
        writeValue(stream, ((CreateEngineRequest) value).toMap());
      } else 
      if (value instanceof CreateEngineResponse) {
        stream.write(129);
        writeValue(stream, ((CreateEngineResponse) value).toMap());
      } else 
      if (value instanceof EventMessage) {
        stream.write(130);
        writeValue(stream, ((EventMessage) value).toMap());
      } else 
      if (value instanceof ReadCompleted) {
        stream.write(131);
        writeValue(stream, ((ReadCompleted) value).toMap());
      } else 
      if (value instanceof ResponseStarted) {
        stream.write(132);
        writeValue(stream, ((ResponseStarted) value).toMap());
      } else 
      if (value instanceof StartRequest) {
        stream.write(133);
        writeValue(stream, ((StartRequest) value).toMap());
      } else 
      if (value instanceof StartResponse) {
        stream.write(134);
        writeValue(stream, ((StartResponse) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface HttpApi {
    @NonNull CreateEngineResponse createEngine(@NonNull CreateEngineRequest request);
    void freeEngine(@NonNull String engineId);
    @NonNull StartResponse start(@NonNull StartRequest request);
    void dummy(@NonNull EventMessage message);

    /** The codec used by HttpApi. */
    static MessageCodec<Object> getCodec() {
      return HttpApiCodec.INSTANCE;
    }

    /** Sets up an instance of `HttpApi` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, HttpApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.HttpApi.createEngine", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              CreateEngineRequest requestArg = (CreateEngineRequest)args.get(0);
              if (requestArg == null) {
                throw new NullPointerException("requestArg unexpectedly null.");
              }
              CreateEngineResponse output = api.createEngine(requestArg);
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.HttpApi.freeEngine", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String engineIdArg = (String)args.get(0);
              if (engineIdArg == null) {
                throw new NullPointerException("engineIdArg unexpectedly null.");
              }
              api.freeEngine(engineIdArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.HttpApi.start", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              StartRequest requestArg = (StartRequest)args.get(0);
              if (requestArg == null) {
                throw new NullPointerException("requestArg unexpectedly null.");
              }
              StartResponse output = api.start(requestArg);
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.HttpApi.dummy", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              EventMessage messageArg = (EventMessage)args.get(0);
              if (messageArg == null) {
                throw new NullPointerException("messageArg unexpectedly null.");
              }
              api.dummy(messageArg);
              wrapped.put("result", null);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}