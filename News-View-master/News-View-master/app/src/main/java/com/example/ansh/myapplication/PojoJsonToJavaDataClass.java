package com.example.ansh.myapplication;

import java.util.ArrayList;
import java.util.List;
//if you find defualt constructors a bit weird
// ,they are solely for testing purposes
//i intended to check jsontopojo class first , that is why i used
//them.

public class PojoJsonToJavaDataClass {
    //FIXME CLASSES >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public class Aggregations {
        //---------------variables---------------------------
        //---------------variables---------------------------
        @Override
        public String toString() {
            return new StringBuilder().toString();
        }
                    //>>>>>>>>>>><<<<<<<<<<<<

    }
    public class SearchMetadata {
        //---------------variables---------------------------
        private Integer startRecord;
        private Integer maximumRecords;
        private Integer count;
        private Integer hits;
        private Integer period;
        private String query;
        private String filter;
        private String client;
        private Integer time;
        private String servicereduction;
        private Integer countTwitterAll;
        private Integer countTwitterNew;
        private Integer countBackend;
        private Integer cacheHits;
        private String scraperInfo;
        private String index;
        //---------------variables---------------------------
        //=======================getters-setters======================================================

        public SearchMetadata() {
        }
        public SearchMetadata(Integer startRecord, Integer maximumRecords, Integer count, Integer hits, Integer period, String query, String filter, String client, Integer time, String servicereduction, Integer countTwitterAll, Integer countTwitterNew, Integer countBackend, Integer cacheHits, String scraperInfo, String index) {
            super();
            this.startRecord = startRecord;
            this.maximumRecords = maximumRecords;
            this.count = count;
            this.hits = hits;
            this.period = period;
            this.query = query;
            this.filter = filter;
            this.client = client;
            this.time = time;
            this.servicereduction = servicereduction;
            this.countTwitterAll = countTwitterAll;
            this.countTwitterNew = countTwitterNew;
            this.countBackend = countBackend;
            this.cacheHits = cacheHits;
            this.scraperInfo = scraperInfo;
            this.index = index;
        }
        public Integer getStartRecord() {
            return startRecord;
        }
        public void setStartRecord(Integer startRecord) {
            this.startRecord = startRecord;
        }
        public Integer getMaximumRecords() {
            return maximumRecords;
        }
        public void setMaximumRecords(Integer maximumRecords) {
            this.maximumRecords = maximumRecords;
        }
        public Integer getCount() {
            return count;
        }
        public void setCount(Integer count) {
            this.count = count;
        }
        public Integer getHits() {
            return hits;
        }
        public void setHits(Integer hits) {
            this.hits = hits;
        }
        public Integer getPeriod() {
            return period;
        }
        public void setPeriod(Integer period) {
            this.period = period;
        }
        public String getQuery() {
            return query;
        }
        public void setQuery(String query) {
            this.query = query;
        }
        public String getFilter() {
            return filter;
        }
        public void setFilter(String filter) {
            this.filter = filter;
        }
        public String getClient() {
            return client;
        }
        public void setClient(String client) {
            this.client = client;
        }
        public Integer getTime() {
            return time;
        }
        public void setTime(Integer time) {
            this.time = time;
        }
        public String getServicereduction() {
            return servicereduction;
        }
        public void setServicereduction(String servicereduction) {
            this.servicereduction = servicereduction;
        }
        public Integer getCountTwitterAll() {
            return countTwitterAll;
        }
        public void setCountTwitterAll(Integer countTwitterAll) {
            this.countTwitterAll = countTwitterAll;
        }
        public Integer getCountTwitterNew() {
            return countTwitterNew;
        }
        public void setCountTwitterNew(Integer countTwitterNew) {
            this.countTwitterNew = countTwitterNew;
        }
        public Integer getCountBackend() {
            return countBackend;
        }
        public void setCountBackend(Integer countBackend) {
            this.countBackend = countBackend;
        }
        public Integer getCacheHits() {
            return cacheHits;
        }
        public void setCacheHits(Integer cacheHits) {
            this.cacheHits = cacheHits;
        }
        public String getScraperInfo() {
            return scraperInfo;
        }
        public void setScraperInfo(String scraperInfo) {
            this.scraperInfo = scraperInfo;
        }
        public String getIndex() {
            return index;
        }
        public void setIndex(String index) {
            this.index = index;
        }
        //=======================getters-setters======================================================
        //=======================toString======================================================
        @Override
        public String toString() {
            return new StringBuilder().append("\n\t startRecord--" + startRecord).append("\n\t maximumRecords--" + maximumRecords).append("\n\t count--" + count).append("\n\t hits--" + hits).append("\n\t period--" + period).append("\n\t query--" + query).append("\n\t filter--" + filter).append("\n\t client--" + client).append("\n\t time--" + time).append("\n\t servicereduction--" + servicereduction).append("\n\t countTwitterAll--" + countTwitterAll).append("\n\t countTwitterNew--" + countTwitterNew).append("\n\t countBackend--" + countBackend).append("\n\t cacheHits--" + cacheHits).append("\n\t scraperInfo--" + scraperInfo).append("\n\t index--" + index).toString();
        }
        //=======================toString======================================================
                                //>>>>>>>>>>><<<<<<<<<<<<
    }
    public class Status {
        //---------------variables---------------------------
        private Integer favouritesCount;
        private String text;
        private Integer retweetCount;
        private User user;

        private Integer hashtagsCount;
        private String providerType;
        private Integer audioCount;
        private String locationSource;
        private List<String> hashtags = null;
        private String link;
        private String createdAt;
        private List<String> videos = null;
        private Integer mentionsCount;
        private Integer withoutLuLen;
        private Integer textLength;
        private Unshorten unshorten;
        private Integer withoutLLen;
        private String screenName;
        private String idStr;
        private List<Double> locationPoint = null;
        private Integer linksCount;
        private List<String> links = null;
        private Integer videosCount;
        private List<Object> audio = null;
        private String placeId;
        private String timestamp;
        private Double classifierLanguageProbability;
        private Integer timestampId;
        private String placeName;
        private List<String> images = null;
        private Integer withoutLuhLen;
        private String classifierLanguage;
        private List<String> hosts = null;
        private String placeCountry;
        private Integer imagesCount;
        private String sourceType;
        private Integer hostsCount;
        private String placeCountryCode;
        private List<Double> placeCountryCenter = null;
        private String placeContext;
        private List<Double> locationMark = null;
        private List<String> mentions = null;
        private Integer locationRadius;
        private Double classifierProfanityProbability;
        private String classifierProfanity;
        private String providerHash;
        private Double classifierEmotionProbability;
        private String classifierEmotion;
        //---------------variables---------------------------

        public Status() {
            this.user=new User();
        }
        public Status(String providerType, Integer audioCount, String locationSource, List<String> hashtags, Integer hashtagsCount, Integer favouritesCount, String link, String createdAt, List<String> videos, Integer mentionsCount, Integer withoutLuLen, Integer textLength, Integer retweetCount, Unshorten unshorten, Integer withoutLLen, String screenName, String idStr, List<Double> locationPoint, Integer linksCount, List<String> links, Integer videosCount, String text, List<Object> audio, String placeId, String timestamp, Double classifierLanguageProbability, Integer timestampId, String placeName, List<String> images, Integer withoutLuhLen, String classifierLanguage, List<String> hosts, String placeCountry, Integer imagesCount, String sourceType, Integer hostsCount, String placeCountryCode, List<Double> placeCountryCenter, String placeContext, List<Double> locationMark, List<String> mentions, User user, Integer locationRadius, Double classifierProfanityProbability, String classifierProfanity, String providerHash, Double classifierEmotionProbability, String classifierEmotion) {
            super();
            this.providerType = providerType;
            this.audioCount = audioCount;
            this.locationSource = locationSource;
            this.hashtags = hashtags;
            this.hashtagsCount = hashtagsCount;
            this.favouritesCount = favouritesCount;
            this.link = link;
            this.createdAt = createdAt;
            this.videos = videos;
            this.mentionsCount = mentionsCount;
            this.withoutLuLen = withoutLuLen;
            this.textLength = textLength;
            this.retweetCount = retweetCount;
            this.unshorten = unshorten;
            this.withoutLLen = withoutLLen;
            this.screenName = screenName;
            this.idStr = idStr;
            this.locationPoint = locationPoint;
            this.linksCount = linksCount;
            this.links = links;
            this.videosCount = videosCount;
            this.text = text;
            this.audio = audio;
            this.placeId = placeId;
            this.timestamp = timestamp;
            this.classifierLanguageProbability = classifierLanguageProbability;
            this.timestampId = timestampId;
            this.placeName = placeName;
            this.images = images;
            this.withoutLuhLen = withoutLuhLen;
            this.classifierLanguage = classifierLanguage;
            this.hosts = hosts;
            this.placeCountry = placeCountry;
            this.imagesCount = imagesCount;
            this.sourceType = sourceType;
            this.hostsCount = hostsCount;
            this.placeCountryCode = placeCountryCode;
            this.placeCountryCenter = placeCountryCenter;
            this.placeContext = placeContext;
            this.locationMark = locationMark;
            this.mentions = mentions;
            this.user = user;
            this.locationRadius = locationRadius;
            this.classifierProfanityProbability = classifierProfanityProbability;
            this.classifierProfanity = classifierProfanity;
            this.providerHash = providerHash;
            this.classifierEmotionProbability = classifierEmotionProbability;
            this.classifierEmotion = classifierEmotion;
        }

        //==========================getter-setterrs=================================================================================

        public String getProviderType() {
            return providerType;
        }
        public void setProviderType(String providerType) {
            this.providerType = providerType;
        }
        public Integer getAudioCount() {
            return audioCount;
        }
        public void setAudioCount(Integer audioCount) {
            this.audioCount = audioCount;
        }
        public String getLocationSource() {
            return locationSource;
        }
        public void setLocationSource(String locationSource) {
            this.locationSource = locationSource;
        }
        public List<String> getHashtags() {
            return hashtags;
        }
        public void setHashtags(List<String> hashtags) {
            this.hashtags = hashtags;
        }
        public Integer getHashtagsCount() {
            return hashtagsCount;
        }
        public void setHashtagsCount(Integer hashtagsCount) {
            this.hashtagsCount = hashtagsCount;
        }
        public Integer getFavouritesCount() {
            return favouritesCount;
        }
        public void setFavouritesCount(Integer favouritesCount) {
            this.favouritesCount = favouritesCount;
        }
        public String getLink() {
            return link;
        }
        public void setLink(String link) {
            this.link = link;
        }
        public String getCreatedAt() {
            return createdAt;
        }
        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }
        public List<String> getVideos() {
            return videos;
        }
        public void setVideos(List<String> videos) {
            this.videos = videos;
        }
        public Integer getMentionsCount() {
            return mentionsCount;
        }
        public void setMentionsCount(Integer mentionsCount) {
            this.mentionsCount = mentionsCount;
        }
        public Integer getWithoutLuLen() {
            return withoutLuLen;
        }
        public void setWithoutLuLen(Integer withoutLuLen) {
            this.withoutLuLen = withoutLuLen;
        }
        public Integer getTextLength() {
            return textLength;
        }
        public void setTextLength(Integer textLength) {
            this.textLength = textLength;
        }
        public Integer getRetweetCount() {
            return retweetCount;
        }
        public void setRetweetCount(Integer retweetCount) {
            this.retweetCount = retweetCount;
        }
        public Unshorten getUnshorten() {
            return unshorten;
        }
        public void setUnshorten(Unshorten unshorten) {
            this.unshorten = unshorten;
        }
        public Integer getWithoutLLen() {
            return withoutLLen;
        }
        public void setWithoutLLen(Integer withoutLLen) {
            this.withoutLLen = withoutLLen;
        }
        public String getScreenName() {
            return screenName;
        }
        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }
        public String getIdStr() {
            return idStr;
        }
        public void setIdStr(String idStr) {
            this.idStr = idStr;
        }
        public List<Double> getLocationPoint() {
            return locationPoint;
        }
        public void setLocationPoint(List<Double> locationPoint) {
            this.locationPoint = locationPoint;
        }
        public Integer getLinksCount() {
            return linksCount;
        }
        public void setLinksCount(Integer linksCount) {
            this.linksCount = linksCount;
        }
        public List<String> getLinks() {
            return links;
        }
        public void setLinks(List<String> links) {
            this.links = links;
        }
        public Integer getVideosCount() {
            return videosCount;
        }
        public void setVideosCount(Integer videosCount) {
            this.videosCount = videosCount;
        }
        public String getText() {
            return text;
        }
        public void setText(String text) {
            this.text = text;
        }
        public List<Object> getAudio() {
            return audio;
        }
        public void setAudio(List<Object> audio) {
            this.audio = audio;
        }
        public String getPlaceId() {
            return placeId;
        }
        public void setPlaceId(String placeId) {
            this.placeId = placeId;
        }
        public String getTimestamp() {
            return timestamp;
        }
        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
        public Double getClassifierLanguageProbability() {
            return classifierLanguageProbability;
        }
        public void setClassifierLanguageProbability(Double classifierLanguageProbability) {
            this.classifierLanguageProbability = classifierLanguageProbability;
        }
        public Integer getTimestampId() {
            return timestampId;
        }
        public void setTimestampId(Integer timestampId) {
            this.timestampId = timestampId;
        }
        public String getPlaceName() {
            return placeName;
        }
        public void setPlaceName(String placeName) {
            this.placeName = placeName;
        }
        public List<String> getImages() {
            return images;
        }
        public void setImages(List<String> images) {
            this.images = images;
        }
        public Integer getWithoutLuhLen() {
            return withoutLuhLen;
        }
        public void setWithoutLuhLen(Integer withoutLuhLen) {
            this.withoutLuhLen = withoutLuhLen;
        }
        public String getClassifierLanguage() {
            return classifierLanguage;
        }
        public void setClassifierLanguage(String classifierLanguage) {
            this.classifierLanguage = classifierLanguage;
        }
        public List<String> getHosts() {
            return hosts;
        }
        public void setHosts(List<String> hosts) {
            this.hosts = hosts;
        }
        public String getPlaceCountry() {
            return placeCountry;
        }
        public void setPlaceCountry(String placeCountry) {
            this.placeCountry = placeCountry;
        }
        public Integer getImagesCount() {
            return imagesCount;
        }
        public void setImagesCount(Integer imagesCount) {
            this.imagesCount = imagesCount;
        }
        public String getSourceType() {
            return sourceType;
        }
        public void setSourceType(String sourceType) {
            this.sourceType = sourceType;
        }
        public Integer getHostsCount() {
            return hostsCount;
        }
        public void setHostsCount(Integer hostsCount) {
            this.hostsCount = hostsCount;
        }
        public String getPlaceCountryCode() {
            return placeCountryCode;
        }
        public void setPlaceCountryCode(String placeCountryCode) {
            this.placeCountryCode = placeCountryCode;
        }
        public List<Double> getPlaceCountryCenter() {
            return placeCountryCenter;
        }
        public void setPlaceCountryCenter(List<Double> placeCountryCenter) {
            this.placeCountryCenter = placeCountryCenter;
        }
        public String getPlaceContext() {
            return placeContext;
        }
        public void setPlaceContext(String placeContext) {
            this.placeContext = placeContext;
        }
        public List<Double> getLocationMark() {
            return locationMark;
        }
        public void setLocationMark(List<Double> locationMark) {
            this.locationMark = locationMark;
        }
        public List<String> getMentions() {
            return mentions;
        }
        public void setMentions(List<String> mentions) {
            this.mentions = mentions;
        }
        public User getUser() {
            return user;
        }
        public void setUser(User user) {
            this.user = user;
        }
        public Integer getLocationRadius() {
            return locationRadius;
        }
        public void setLocationRadius(Integer locationRadius) {
            this.locationRadius = locationRadius;}
        public Double getClassifierProfanityProbability() {
            return classifierProfanityProbability;
        }
        public void setClassifierProfanityProbability(Double classifierProfanityProbability) {
            this.classifierProfanityProbability = classifierProfanityProbability;
        }
        public String getClassifierProfanity() {
            return classifierProfanity;
        }
        public void setClassifierProfanity(String classifierProfanity) {
            this.classifierProfanity = classifierProfanity;
        }
        public String getProviderHash() {
            return providerHash;
        }
        public void setProviderHash(String providerHash) {
            this.providerHash = providerHash;
        }
        public Double getClassifierEmotionProbability() {
            return classifierEmotionProbability;
        }
        public void setClassifierEmotionProbability(Double classifierEmotionProbability) {
            this.classifierEmotionProbability = classifierEmotionProbability;
        }
        public String getClassifierEmotion() {
            return classifierEmotion;
        }
        public void setClassifierEmotion(String classifierEmotion) {
            this.classifierEmotion = classifierEmotion;
        }
        //==========================getter-setterrs==================================================================================
        //==========================tosting================================================================================
        @Override
        public String toString() {
            return new StringBuilder().append("\n---- providerType--" + providerType).append("\n---- audioCount--" + audioCount).append("\n---- locationSource--" + locationSource).append("\n---- hashtags--" + hashtags).append("\n---- hashtagsCount--" + hashtagsCount).append("\n---- favouritesCount--" + favouritesCount).append("\n---- link--" + link).append("\n---- createdAt--" + createdAt).append("\n---- videos--" + videos).append("\n---- mentionsCount--" + mentionsCount).append("\n---- withoutLuLen--" + withoutLuLen).append("\n---- textLength--" + textLength).append("\n---- retweetCount--" + retweetCount).append("\n---- unshorten--" + unshorten).append("\n---- withoutLLen--" + withoutLLen).append("\n---- screenName--" + screenName).append("\n---- idStr--" + idStr).append("\n---- locationPoint--" + locationPoint).append("\n---- linksCount--" + linksCount).append("\n---- links--" + links).append("\n---- videosCount--" + videosCount).append("\n---- text--" + text).append("\n---- audio--" + audio).append("\n---- placeId--" + placeId).append("\n---- timestamp--" + timestamp).append("\n---- classifierLanguageProbability--" + classifierLanguageProbability).append("\n---- timestampId--" + timestampId).append("\n---- placeName--" + placeName).append("\n---- images--" + images).append("\n---- withoutLuhLen--" + withoutLuhLen).append("\n---- classifierLanguage--" + classifierLanguage).append("\n---- hosts--" + hosts).append("\n---- placeCountry--" + placeCountry).append("\n---- imagesCount--" + imagesCount).append("\n---- sourceType--" + sourceType).append("\n---- hostsCount--" + hostsCount).append("\n---- placeCountryCode--" + placeCountryCode).append("\n---- placeCountryCenter--" + placeCountryCenter).append("\n---- placeContext--" + placeContext).append("\n---- locationMark--" + locationMark).append("\n---- mentions--" + mentions).append("\n---- user--" + user).append("\n---- locationRadius--" + locationRadius).append("\n---- classifierProfanityProbability--" + classifierProfanityProbability).append("\n---- classifierProfanity--" + classifierProfanity).append("\n---- providerHash--" + providerHash).append("\n---- classifierEmotionProbability--" + classifierEmotionProbability).append("\n---- classifierEmotion--" + classifierEmotion).toString();
        }
        //==========================tosting=================================================================================

                                     //>>>>>>>>>>><<<<<<<<<<<<


    }
    public class Unshorten {
        //---------------variables---------------------------
        private String httpLoklakOrgXId920838573087215616;
        private String httpLoklakOrgXId920838535359242241;
        private String httpLoklakOrgXId920838501935050753;
        private String httpLoklakOrgXId920524161663094785;
        private String httpLoklakOrgXId920524156889960449;
        private String httpLoklakOrgXId920524155572903936;
        private String httpLoklakOrgXId920524134605623296;
        private String httpLoklakOrgXId920524126195994624;
        //---------------variables---------------------------

        //constructors
        public Unshorten() {
        }
        public Unshorten(String httpLoklakOrgXId920838573087215616, String httpLoklakOrgXId920838535359242241, String httpLoklakOrgXId920838501935050753, String httpLoklakOrgXId920524161663094785, String httpLoklakOrgXId920524156889960449, String httpLoklakOrgXId920524155572903936, String httpLoklakOrgXId920524134605623296, String httpLoklakOrgXId920524126195994624) {
            super();
            this.httpLoklakOrgXId920838573087215616 = httpLoklakOrgXId920838573087215616;
            this.httpLoklakOrgXId920838535359242241 = httpLoklakOrgXId920838535359242241;
            this.httpLoklakOrgXId920838501935050753 = httpLoklakOrgXId920838501935050753;
            this.httpLoklakOrgXId920524161663094785 = httpLoklakOrgXId920524161663094785;
            this.httpLoklakOrgXId920524156889960449 = httpLoklakOrgXId920524156889960449;
            this.httpLoklakOrgXId920524155572903936 = httpLoklakOrgXId920524155572903936;
            this.httpLoklakOrgXId920524134605623296 = httpLoklakOrgXId920524134605623296;
            this.httpLoklakOrgXId920524126195994624 = httpLoklakOrgXId920524126195994624;
        }
        //constructors

        //==========================getter-setterrs===============================================
        public String getHttpLoklakOrgXId920838573087215616() {
            return httpLoklakOrgXId920838573087215616;
        }
        public void setHttpLoklakOrgXId920838573087215616(String httpLoklakOrgXId920838573087215616) {
            this.httpLoklakOrgXId920838573087215616 = httpLoklakOrgXId920838573087215616;
        }
        public String getHttpLoklakOrgXId920838535359242241() {
            return httpLoklakOrgXId920838535359242241;
        }
        public void setHttpLoklakOrgXId920838535359242241(String httpLoklakOrgXId920838535359242241) {
            this.httpLoklakOrgXId920838535359242241 = httpLoklakOrgXId920838535359242241;
        }
        public String getHttpLoklakOrgXId920838501935050753() {
            return httpLoklakOrgXId920838501935050753;
        }
        public void setHttpLoklakOrgXId920838501935050753(String httpLoklakOrgXId920838501935050753) {
            this.httpLoklakOrgXId920838501935050753 = httpLoklakOrgXId920838501935050753;
        }
        public String getHttpLoklakOrgXId920524161663094785() {
            return httpLoklakOrgXId920524161663094785;
        }
        public void setHttpLoklakOrgXId920524161663094785(String httpLoklakOrgXId920524161663094785) {
            this.httpLoklakOrgXId920524161663094785 = httpLoklakOrgXId920524161663094785;
        }
        public String getHttpLoklakOrgXId920524156889960449() {
            return httpLoklakOrgXId920524156889960449;
        }
        public void setHttpLoklakOrgXId920524156889960449(String httpLoklakOrgXId920524156889960449) {
            this.httpLoklakOrgXId920524156889960449 = httpLoklakOrgXId920524156889960449;
        }
        public String getHttpLoklakOrgXId920524155572903936() {
            return httpLoklakOrgXId920524155572903936;
        }
        public void setHttpLoklakOrgXId920524155572903936(String httpLoklakOrgXId920524155572903936) {
            this.httpLoklakOrgXId920524155572903936 = httpLoklakOrgXId920524155572903936;
        }
        public String getHttpLoklakOrgXId920524134605623296() {
            return httpLoklakOrgXId920524134605623296;
        }
        public void setHttpLoklakOrgXId920524134605623296(String httpLoklakOrgXId920524134605623296) {
            this.httpLoklakOrgXId920524134605623296 = httpLoklakOrgXId920524134605623296;
        }
        public String getHttpLoklakOrgXId920524126195994624() {
            return httpLoklakOrgXId920524126195994624;
        }
        public void setHttpLoklakOrgXId920524126195994624(String httpLoklakOrgXId920524126195994624) {
            this.httpLoklakOrgXId920524126195994624 = httpLoklakOrgXId920524126195994624;
        }
        //==========================getter-setterrs==================================================================================

        //---------------------------------tostring----------------------------
        @Override
        public String toString() {
            return new StringBuilder()
                    .append("\n\t httpLoklakOrgXId920838573087215616--" + httpLoklakOrgXId920838573087215616)
                    .append("\n\t httpLoklakOrgXId920838535359242241--" + httpLoklakOrgXId920838535359242241)
                    .append("\n\t httpLoklakOrgXId920838501935050753--" + httpLoklakOrgXId920838501935050753)
                    .append("\n\t httpLoklakOrgXId920524161663094785--" + httpLoklakOrgXId920524161663094785)
                    .append("\n\t httpLoklakOrgXId920524156889960449--" + httpLoklakOrgXId920524156889960449)
                    .append("\n\t httpLoklakOrgXId920524155572903936--" + httpLoklakOrgXId920524155572903936)
                    .append("\n\t httpLoklakOrgXId920524134605623296--" + httpLoklakOrgXId920524134605623296)
                    .append("\n\t httpLoklakOrgXId920524126195994624--" + httpLoklakOrgXId920524126195994624)
                    .toString();
        }
        //---------------------------------tostring----------------------------
                                        //>>>>>>>>>>><<<<<<<<<<<<
    }
    public class User {
        //---------------variables---------------------------
        private String appearanceFirst;
        private String profileImageUrlHttps;
        private String screenName;
        private String userId;
        private String name;
        private String appearanceLatest;
        //---------------variables---------------------------

        //constructors
        public User() {
        }
        public User(String appearanceFirst, String profileImageUrlHttps, String screenName, String userId, String name, String appearanceLatest) {
            super();
            this.appearanceFirst = appearanceFirst;
            this.profileImageUrlHttps = profileImageUrlHttps;
            this.screenName = screenName;
            this.userId = userId;
            this.name = name;
            this.appearanceLatest = appearanceLatest;
        }
        //constuctors

        //==========================getter-setterrs==================================================================================
        public String getAppearanceFirst() {
            return appearanceFirst;
        }
        public void setAppearanceFirst(String appearanceFirst) {this.appearanceFirst = appearanceFirst;}
        public String getProfileImageUrlHttps() {
            return profileImageUrlHttps;
        }
        public void setProfileImageUrlHttps(String profileImageUrlHttps) {this.profileImageUrlHttps = profileImageUrlHttps;}
        public String getScreenName() {
            return screenName;
        }
        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }
        public String getUserId() {
            return userId;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAppearanceLatest() {
            return appearanceLatest;
        }
        public void setAppearanceLatest(String appearanceLatest) {
            this.appearanceLatest = appearanceLatest;
        }
        //==========================getter-setterrs==================================================================================
        //---------------tostring---------------------------
        @Override
        public String toString() {
            return new StringBuilder()
                    .append("\n---->>>> appearanceFirst--" + appearanceFirst)
                    .append("\n---->>>> profileImageUrlHttps--" + profileImageUrlHttps)
                    .append("\n---->>>> screenName--" + screenName)
                    .append("\n---->>>> userId--" + userId)
                    .append("\n---->>>> name--" + name)
                    .append("\n---->>>> appearanceLatest--" + appearanceLatest)
                    .toString();
        }
        //---------------tostring---------------------------


    }
    //FIXME CLASSES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //---------------variables---------------------------
    private String readme0;
    private String readme1;
    private String readme2;
    private String readme3;
    private SearchMetadata searchMetadata;
    private ArrayList<Status> statuses = null;
    private Aggregations aggregations;
    //---------------variables---------------------------

    //constructors
    public PojoJsonToJavaDataClass() {
        this.searchMetadata=new SearchMetadata();
        this.statuses=new ArrayList<>() ;
        statuses.add(null);
        statuses.add(null);
        statuses.add(null);
        statuses.add(new Status());




    }
    public PojoJsonToJavaDataClass(String readme0, String readme1, String readme2, String readme3, SearchMetadata searchMetadata, ArrayList<Status> statuses, Aggregations aggregations) {
        super();
        this.readme0 = readme0;
        this.readme1 = readme1;
        this.readme2 = readme2;
        this.readme3 = readme3;
        this.searchMetadata = searchMetadata;
        this.statuses = statuses;
        this.aggregations = aggregations;
    }
    //constructors
    //==========================getter-setterrs=========================================
    public String getReadme0() {
        return readme0;
    }
    public void setReadme0(String readme0) {
        this.readme0 = readme0;
    }
    public String getReadme1() {
        return readme1;
    }
    public void setReadme1(String readme1) {
        this.readme1 = readme1;
    }
    public String getReadme2() {
        return readme2;
    }
    public void setReadme2(String readme2) {
        this.readme2 = readme2;
    }
    public String getReadme3() {
        return readme3;
    }
    public void setReadme3(String readme3) {
        this.readme3 = readme3;
    }
    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }
    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }
    public List<Status> getStatuses() {
        return statuses;
    }
    public void setStatuses(ArrayList<Status> statuses) {
        this.statuses = statuses;
    }
    public Aggregations getAggregations() {
        return aggregations;
    }
    public void setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
    }
    //==========================getter-setterrs=========================================

    //---------------tostring---------------------------
    @Override
    public String toString() {
        return new StringBuilder().append("\n\t readme0--" + readme0).append("\n\t readme1--" + readme1).append("\n\t readme2--" + readme2).append("\n\t readme3--" + readme3).append("\n\t searchMetadata--" + searchMetadata).append("\n\t statuses--" + statuses).append("\n\t aggregations--" + aggregations).toString();
    }
    //---------------tostring---------------------------




}
