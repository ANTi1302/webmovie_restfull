USE [webmovie_anime]
GO
/****** Object:  Table [dbo].[about]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[about](
	[about_id] [uniqueidentifier] NOT NULL,
	[title] [nvarchar](500) NULL,
	[description] [nvarchar](1000) NULL,
	[img] [nvarchar](1000) NULL,
	[contact] [nvarchar](500) NULL,
 CONSTRAINT [PK_about] PRIMARY KEY CLUSTERED 
(
	[about_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[blog_detail]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[blog_detail](
	[blog_id] [uniqueidentifier] NOT NULL,
	[details] [varchar](4000) NULL,
	[tagline] [varchar](50) NULL,
	[created_at] [date] NULL,
	[updated_at] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[blog_genres]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[blog_genres](
	[genres_id] [uniqueidentifier] NOT NULL,
	[blog_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_blog_genres] PRIMARY KEY CLUSTERED 
(
	[genres_id] ASC,
	[blog_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[blogs]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[blogs](
	[blog_id] [uniqueidentifier] NOT NULL,
	[title] [nvarchar](500) NULL,
	[img_path] [nvarchar](500) NULL,
	[top_blog] [int] NULL,
 CONSTRAINT [PK_blogs] PRIMARY KEY CLUSTERED 
(
	[blog_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[country]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[country](
	[country_id] [uniqueidentifier] NOT NULL,
	[name] [nvarchar](500) NULL,
 CONSTRAINT [PK_country] PRIMARY KEY CLUSTERED 
(
	[country_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[episode]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[episode](
	[episode_id] [uniqueidentifier] NOT NULL,
	[path_video] [nvarchar](1000) NULL,
	[number_season] [int] NULL,
	[poster] [nvarchar](1000) NULL,
 CONSTRAINT [PK_episode] PRIMARY KEY CLUSTERED 
(
	[episode_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[favorite]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[favorite](
	[favorite_id] [uniqueidentifier] NOT NULL,
	[user_id] [uniqueidentifier] NOT NULL,
	[created_at] [datetime] NULL,
 CONSTRAINT [PK_favorite_1] PRIMARY KEY CLUSTERED 
(
	[favorite_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[genres]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[genres](
	[genres_id] [uniqueidentifier] NOT NULL,
	[name] [nvarchar](1000) NULL,
 CONSTRAINT [PK_genres] PRIMARY KEY CLUSTERED 
(
	[genres_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[image_blogs]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[image_blogs](
	[image_id] [uniqueidentifier] NOT NULL,
	[url] [nvarchar](1000) NULL,
	[blog_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_image_blogs_1] PRIMARY KEY CLUSTERED 
(
	[image_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[keyword]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[keyword](
	[keyword_id] [uniqueidentifier] NOT NULL,
	[name] [nvarchar](500) NULL,
 CONSTRAINT [PK_keyword] PRIMARY KEY CLUSTERED 
(
	[keyword_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[keyword_blog]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[keyword_blog](
	[keyword_id] [uniqueidentifier] NOT NULL,
	[blog_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_keyword_blog] PRIMARY KEY CLUSTERED 
(
	[keyword_id] ASC,
	[blog_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[menus]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[menus](
	[menus_id] [uniqueidentifier] NOT NULL,
	[name] [nvarchar](500) NULL,
	[url] [nvarchar](1000) NULL,
 CONSTRAINT [PK_menus] PRIMARY KEY CLUSTERED 
(
	[menus_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie](
	[movie_id] [uniqueidentifier] NOT NULL,
	[title] [nvarchar](500) NULL,
	[name] [nvarchar](500) NULL,
	[overview] [nvarchar](1000) NULL,
	[runtime] [int] NULL,
	[tagline] [nvarchar](500) NULL,
	[status] [nvarchar](500) NULL,
	[votes_avg] [float] NULL,
	[votes_count] [int] NULL,
	[type] [nvarchar](50) NULL,
	[studios] [uniqueidentifier] NOT NULL,
	[date_aired] [int] NULL,
	[quality] [nvarchar](50) NULL,
	[views] [money] NULL,
	[scores_avg] [float] NULL,
	[scores_count] [int] NULL,
	[poster_path] [nvarchar](1000) NULL,
	[recently] [tinyint] NULL,
	[live] [tinyint] NULL,
	[popular] [tinyint] NULL,
	[trending] [tinyint] NULL,
	[user_id] [uniqueidentifier] NOT NULL,
	[role_age] [int] NULL,
 CONSTRAINT [PK_movie_1] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_cast]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_cast](
	[person_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
	[character_name] [nvarchar](500) NULL,
	[cast_order] [date] NULL,
 CONSTRAINT [PK_movie_cast] PRIMARY KEY CLUSTERED 
(
	[person_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_company]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_company](
	[company_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_company] PRIMARY KEY CLUSTERED 
(
	[company_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_country]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_country](
	[movie_id] [uniqueidentifier] NOT NULL,
	[country_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_country] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC,
	[country_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_episode]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_episode](
	[movie_id] [uniqueidentifier] NOT NULL,
	[episode] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_episode] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC,
	[episode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_favorite]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_favorite](
	[favorite_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_favorite] PRIMARY KEY CLUSTERED 
(
	[favorite_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_genres]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_genres](
	[genres_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_genres] PRIMARY KEY CLUSTERED 
(
	[genres_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_keyword]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_keyword](
	[movie_id] [uniqueidentifier] NOT NULL,
	[keyword_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_keyword] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC,
	[keyword_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_season]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_season](
	[season_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_season] PRIMARY KEY CLUSTERED 
(
	[season_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_series]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_series](
	[movie_id] [uniqueidentifier] NOT NULL,
	[series_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_series] PRIMARY KEY CLUSTERED 
(
	[movie_id] ASC,
	[series_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[movie_watch]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[movie_watch](
	[watch_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_movie_watch] PRIMARY KEY CLUSTERED 
(
	[watch_id] ASC,
	[movie_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[person]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[person](
	[person_id] [uniqueidentifier] NOT NULL,
	[person_name] [nvarchar](500) NULL,
 CONSTRAINT [PK_person] PRIMARY KEY CLUSTERED 
(
	[person_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[production_company]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[production_company](
	[company_id] [uniqueidentifier] NOT NULL,
	[name] [nvarchar](500) NULL,
 CONSTRAINT [PK_production_company] PRIMARY KEY CLUSTERED 
(
	[company_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[rating]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[rating](
	[rating_id] [uniqueidentifier] NOT NULL,
	[movie_id] [uniqueidentifier] NOT NULL,
	[count_start] [int] NULL,
	[num_rating] [int] NULL,
 CONSTRAINT [PK_rating_1] PRIMARY KEY CLUSTERED 
(
	[rating_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[review]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[review](
	[review_id] [uniqueidentifier] NOT NULL,
	[user_id] [uniqueidentifier] NOT NULL,
	[comment] [nvarchar](1000) NULL,
	[created_at] [datetime] NULL,
	[status] [bit] NULL,
	[movie_id] [uniqueidentifier] NULL,
	[blog_id] [uniqueidentifier] NULL,
	[count_like] [int] NULL,
	[review_reply] [uniqueidentifier] NULL,
 CONSTRAINT [PK_review_1] PRIMARY KEY CLUSTERED 
(
	[review_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[role_user]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[role_user](
	[role_id] [uniqueidentifier] NOT NULL,
	[user_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_role_user] PRIMARY KEY CLUSTERED 
(
	[role_id] ASC,
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[roles]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[roles](
	[role_id] [uniqueidentifier] NOT NULL,
	[title] [nvarchar](50) NULL,
	[active] [bit] NULL,
	[description] [nvarchar](500) NULL,
	[created_at] [date] NULL,
	[update_at] [date] NULL,
 CONSTRAINT [PK_roles] PRIMARY KEY CLUSTERED 
(
	[role_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[season]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[season](
	[season_id] [uniqueidentifier] NOT NULL,
	[start_year] [int] NULL,
	[end_year] [int] NULL,
 CONSTRAINT [PK_season_1] PRIMARY KEY CLUSTERED 
(
	[season_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[series]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[series](
	[series_id] [uniqueidentifier] NOT NULL,
	[title] [nvarchar](500) NULL,
	[start_year] [int] NULL,
	[genre] [uniqueidentifier] NULL,
 CONSTRAINT [PK_series_1] PRIMARY KEY CLUSTERED 
(
	[series_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[slides]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[slides](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[img] [nvarchar](1000) NULL,
	[caption] [nvarchar](500) NULL,
	[contents] [nvarchar](500) NULL,
	[link] [nvarchar](1000) NULL,
 CONSTRAINT [PK_slides] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[users]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[user_id] [uniqueidentifier] NOT NULL,
	[first_name] [nvarchar](500) NULL,
	[last_name] [nvarchar](500) NULL,
	[email] [nvarchar](500) NULL,
	[phone] [nvarchar](50) NULL,
	[password] [nvarchar](1000) NULL,
	[access_tokenID] [nvarchar](1000) NULL,
	[path_img] [nvarchar](1000) NULL,
 CONSTRAINT [PK_user_1] PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[watch]    Script Date: 7/18/2022 10:54:24 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[watch](
	[watch_id] [uniqueidentifier] NOT NULL,
	[created_at] [datetime] NULL,
	[user_id] [uniqueidentifier] NOT NULL,
 CONSTRAINT [PK_watch_1] PRIMARY KEY CLUSTERED 
(
	[watch_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'c3559105-a7a3-4624-b208-d19a91423000', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'40dfd99a-9988-436a-90fd-0237e783d480', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'5dd4d9dc-9b5a-48e3-a37a-07bc9b56e986', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'b20854c8-0581-4607-9c89-1e90856ac79e', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'8a642cfa-49f9-48e9-82af-2290dc4e0bfe', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'18c5db31-cc7d-4797-b236-2342627319ff', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'6aa2c3af-b5e4-4337-b617-34e332572b53', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'5ba4875a-e978-4111-89c0-441d0bb01332', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'281940d2-d735-45ec-a862-4e87f80d60f6', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'257e9427-97bb-4cfe-bcc2-8da75f8a85c6', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'05b0d02b-4b45-4d80-9449-96d4ffdcdae6', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'f5dac7f9-7810-4b1f-ba59-d01514824414', NULL, NULL, NULL, NULL)
INSERT [dbo].[blog_detail] ([blog_id], [details], [tagline], [created_at], [updated_at]) VALUES (N'69036386-fda5-450f-bc07-e64fb8b0b87d', N'<div class="blog__details__text">
                            <p>As a result the last couple of eps haven’t been super exciting for me, because they’ve
                                been more like settling into a familiar and comfortable routine.  We’re seeing character
                                growth here but it’s subtle (apart from Shouyou, arguably).  I mean, Tobio being an
                                asshole is nothing new – it’s kind of the foundation of his entire character arc. 
                                Confronting whether his being an asshole is a problem for the Crows this directly is a
                                bit of an evolution, and probably an overdue one at that, but the overall dynamic with
                            Kageyama is basically unchanged.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Tobio-Nishinoya showdown:</h4>
                            <img src="img/blog/details/bd-item-1.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>Nanatsu no Taizai: Kamigami No Gekirin</h4>
                            <img src="img/blog/details/bd-item-2.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>
                        <div class="blog__details__item__text">
                            <h4>ID:Ianvaded:</h4>
                            <img src="img/blog/details/bd-item-3.jpg" alt="">
                            <p>In Japan the idea of a first-year speaking to a senior the way Kageyama did to Asahi is a
                                lot more shocking than it would be in the West, but Tobio calling out teammates in
                                genuinely rude fashion in the middle of a match is what got him isolated in the first
                                place.  It’s better for the Crows to sort this out in practice matches than the real
                                deal, but this is really on Tobio – he has to figure out how to co-exist with others in
                            a team environment.</p>
                        </div>', NULL, CAST(N'2022-07-05' AS Date), CAST(N'2022-07-05' AS Date))
GO
INSERT [dbo].[blog_genres] ([genres_id], [blog_id]) VALUES (N'e51293f5-ecf0-48d5-96a1-49bb1408e28b', N'40dfd99a-9988-436a-90fd-0237e783d480')
INSERT [dbo].[blog_genres] ([genres_id], [blog_id]) VALUES (N'e51293f5-ecf0-48d5-96a1-49bb1408e28b', N'c3559105-a7a3-4624-b208-d19a91423000')
INSERT [dbo].[blog_genres] ([genres_id], [blog_id]) VALUES (N'ab549635-993d-4a9d-bad8-68eefa990c2f', N'40dfd99a-9988-436a-90fd-0237e783d480')
INSERT [dbo].[blog_genres] ([genres_id], [blog_id]) VALUES (N'ab549635-993d-4a9d-bad8-68eefa990c2f', N'c3559105-a7a3-4624-b208-d19a91423000')
GO
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'40dfd99a-9988-436a-90fd-0237e783d480', N'Housekishou Richard shi no Nazo Kantei Season 08 - 20', N'img/blog/blog-1.jpg', 1)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'5dd4d9dc-9b5a-48e3-a37a-07bc9b56e986', N'Fate/Stay Night: Untimated Blade World', N'img/blog/blog-4.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'b20854c8-0581-4607-9c89-1e90856ac79e', N'Building a Better LiA Drilling Down', N'img/blog/blog-5.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'8a642cfa-49f9-48e9-82af-2290dc4e0bfe', N'Bok no Hero Academia Season 4 – 18', N'img/blog/blog-7.jpg', 1)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'18c5db31-cc7d-4797-b236-2342627319ff', N'Yuri Kuma Arashi Viverra Tortor Pharetra', N'img/blog/blog-10.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'6aa2c3af-b5e4-4337-b617-34e332572b53', N'Bok no Hero Academia Season 4 – 18', N'img/blog/blog-11.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'5ba4875a-e978-4111-89c0-441d0bb01332', N'Yuri Kuma Arashi Viverra Tortor Pharetra', N'img/blog/blog-2.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'281940d2-d735-45ec-a862-4e87f80d60f6', N'Fate/Stay Night: Untimated Blade World', N'img/blog/blog-3.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'257e9427-97bb-4cfe-bcc2-8da75f8a85c6', N'Building a Better LiA Drilling Down', N'img/blog/blog-6.jpg', 1)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'05b0d02b-4b45-4d80-9449-96d4ffdcdae6', N'Fate/Stay Night: Untimated Blade World', N'img/blog/blog-8.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'f5dac7f9-7810-4b1f-ba59-d01514824414', N'Fate/Stay Night: Untimated Blade World', N'img/blog/blog-9.jpg', 0)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'c3559105-a7a3-4624-b208-d19a91423000', N'Anime for Beginners: 20 Pieces of Essential Viewing', N'img/blog/blog-12.jpg', 1)
INSERT [dbo].[blogs] ([blog_id], [title], [img_path], [top_blog]) VALUES (N'69036386-fda5-450f-bc07-e64fb8b0b87d', N'Fate/Stay Night: Untimated Blade World', N'img/blog/blog-5.jpg', 0)
GO
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'9324b8b1-57fb-45c7-931a-2a493c84c192', N'Phim Nhật Bản')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'd890f065-8965-48a7-8584-6eec12005840', N'Phim Ấn Độ')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'977eda06-966e-4d44-9c89-b241819f4960', N'Phim Âu Mỹ')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'a71c7b1f-9544-47fa-9c90-bbdb5f3675b6', N'Phim Trung Quốc')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'b9911cb6-00bc-4d3e-b510-d4c5f8af0eb9', N'Phim Hồng Kông')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'cc0c90af-814b-4976-93b3-e32950893c46', N'Phim Hàn Quốc')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'e3106f84-af2c-411b-b242-ed5357a856d7', N'Phim Thái Lan')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'dd3215eb-eb0f-45a3-a4d6-f5efcc07bb45', N'Phim Đài Loan')
INSERT [dbo].[country] ([country_id], [name]) VALUES (N'60c65b29-3778-4f82-9ae2-fb9f813ef3ab', N'Phim Tổng Hợp')
GO
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'4cd6fab5-bcd2-45d6-ac6c-07072d0d6932', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'd3d2ef5c-0c21-4015-940f-0aead7d0aee3', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'aa821211-093a-47c8-9824-0fa98b0c48ac', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'ef96d953-15d8-493c-b995-11076cf4feba', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'd03e9613-faa0-41cd-ac5e-2a76e47a2873', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'3c7ac50c-d389-4465-8d13-43c4ee343d85', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'cef76bec-b50b-410a-bbf4-4686a4c4a44e', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'ffbe9d10-385c-45ae-b1ee-4e1cef40bb5a', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'e65ca989-9713-42a0-84f0-56e10b4bfa11', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'084dbb59-da84-4f01-8a07-633c15731691', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'f8b8b8f6-4f76-416d-876b-65172dc4f5f3', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'e16668ec-f552-4f4d-8146-7a2ec3d59b69', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'08a49d19-a598-4651-b0ef-9e0af315bcaa', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'9e235824-3d29-4056-935f-a0fbe5ba9945', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'22008a1f-5a58-422a-bdcd-a1538cc0ee42', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'20ef0465-339b-4897-8f2a-ad928df0e0d5', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'8cebadc7-4b94-4202-86f1-b75ffac7c128', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'd2121497-3f3c-4e2a-bd4f-c0de7ce8ffc6', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'8763f495-ac92-44ed-b062-c123d278a84b', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'a5d61972-1b15-4e33-8783-d3bdcee869bd', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'd2798fca-dedb-4a73-8d40-d71caee962be', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'b3b3baea-192e-4676-bb15-e6c2a6a7d75d', N'videos/2.mp4', 2, N'./videos/anime-watch2.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'3319394c-fb2f-4ace-afc2-e86bd7c9dc0c', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'2dd3787c-f91e-44b4-827a-ef41dd59c293', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'3d98a555-64b8-479f-834a-fd2e0ebf931b', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
INSERT [dbo].[episode] ([episode_id], [path_video], [number_season], [poster]) VALUES (N'1ec27168-a591-434d-a7d1-ffdcc654b894', N'videos/1.mp4', 1, N'./videos/anime-watch.jpg')
GO
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'5cee56e5-6d5d-4025-824b-053723df122c', N'Tâm Lý')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'a29d50c5-27be-4adb-a388-1e5505cd9ece', N'Hình Sự')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'0cc22178-8a2b-417b-9523-292cec7a230b', N'Chiến Tranh')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'f6fa152c-b1da-4fb2-87fd-476731409247', N'Gia Đình')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'e51293f5-ecf0-48d5-96a1-49bb1408e28b', N'Action')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'928c1083-1438-41c3-9ad9-65a6520ffad0', N'Võ Thuật')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'ab549635-993d-4a9d-bad8-68eefa990c2f', N'Magic ')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'6ef055ae-7e16-4a60-acb1-6daf30556242', N'Viễn Tưởng')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'a704244c-25d3-4e16-8902-700e2cacf5f9', N'Hành Động')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'692e05db-f14d-4abf-af78-7626c297f1df', N'Hài Hước')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'07b96fa4-6a0f-4e73-9de5-a60ce8560d46', N'Kinh Dị')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'7aa13aa5-ca7c-41b8-b936-ad8d9da4342d', N'Cổ Trang')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'46c92196-8320-4fd9-b33d-b37e4c741726', N'Thần Thoại')
INSERT [dbo].[genres] ([genres_id], [name]) VALUES (N'a1d85d26-6200-465a-aa1c-b84390cfa3fd', N'Hoạt Hình')
GO
INSERT [dbo].[keyword] ([keyword_id], [name]) VALUES (N'16a0b1c8-6221-4a02-9bbc-83cebe09a9cb', N'Sport')
INSERT [dbo].[keyword] ([keyword_id], [name]) VALUES (N'225a8ae4-51af-4ea6-ad4e-df6c256dee05', N'Healthfood')
INSERT [dbo].[keyword] ([keyword_id], [name]) VALUES (N'50026ad4-d465-4525-baea-f28a07918d92', N'Game')
GO
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'16a0b1c8-6221-4a02-9bbc-83cebe09a9cb', N'40dfd99a-9988-436a-90fd-0237e783d480')
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'16a0b1c8-6221-4a02-9bbc-83cebe09a9cb', N'c3559105-a7a3-4624-b208-d19a91423000')
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'225a8ae4-51af-4ea6-ad4e-df6c256dee05', N'40dfd99a-9988-436a-90fd-0237e783d480')
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'225a8ae4-51af-4ea6-ad4e-df6c256dee05', N'c3559105-a7a3-4624-b208-d19a91423000')
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'50026ad4-d465-4525-baea-f28a07918d92', N'40dfd99a-9988-436a-90fd-0237e783d480')
INSERT [dbo].[keyword_blog] ([keyword_id], [blog_id]) VALUES (N'50026ad4-d465-4525-baea-f28a07918d92', N'c3559105-a7a3-4624-b208-d19a91423000')
GO
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'f3e044bd-2ea6-4bc5-b126-12cfb7e7ccae', N'Blog', N'blog')
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'16e0e581-589d-40b7-b10d-36d8e3fcf50d', N'Movie', N'movie')
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'46c9a47c-e291-468c-abba-407592a5b3d8', N'Login', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'926b87fe-d246-4c69-87c2-417dc7242517', N'Contacts', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'b8d82a20-02dd-423d-829a-5c2e1b506460', N'Series', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'c61bc089-66c4-454c-be9d-5df6d69ad0aa', N'Sign Up', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'b71f8dbc-be5c-4dc8-80f1-696aa479f1a2', N'Country', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'38d1d47e-10f6-498b-8cab-78c9dcb7da98', N'Genres', NULL)
INSERT [dbo].[menus] ([menus_id], [name], [url]) VALUES (N'05055bee-a883-4b7b-b9e5-ebe70158f549', N'Seasion', NULL)
GO
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'25965fff-303b-4f2c-a78e-0775cd0d6f54', N'Sen to Chihiro no Kamikakushi', N'Sen to Chihiro no Kamikakushi', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 52, N'Count', N'1', 5.359, 41, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 213568.0000, 7.35, 3698, N'img/popular/popular-1.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'6167f265-c628-4523-8118-0a1c662fd7b6', N'Mushishi Zoku Shou 2nd Season', N'Mushishi Zoku Shou 2nd Season', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 67, N'inhabiting the world', N'1', 5.268, 47, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 258977.0000, 6.28, 7899, N'img/popular/popular-5.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 13)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'4acb200d-bb36-41e1-a05c-18c26c0cb2a4', N'The Seven Deadly Sins: Wrath of the Gods', N'The Seven Deadly Sins: Wrath of the Gods', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 65, N'written on their body', N'0', 6.598, 52, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2018, N'HD', 525685.0000, 6.8, 5665, N'img/trending/trend-1.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 15)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'f1680e6f-9dc9-410a-a13f-23fef8709d16', N'Shingeki no Kyojin Season 3 Part 2', N'Shingeki no Kyojin Season 3 Part 2', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 50, N'Yuusha', N'1', 1.032, 20, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2022, N'HD', 125899.0000, 7.35, 1515, N'img/trending/trend-3.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59', N'Fullmetal Alchemist: Brotherhood', N'Fullmetal Alchemist: Brotherhood', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 58, N'Yamann', N'0', 1.859, 30, N'TV Series', N'a8059ecf-9f62-410e-bae1-d1bdf9ebd43d', 2022, N'HD', 259821.0000, 2.98, 1515, N'img/trending/trend-4.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 21)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'ef27f830-7c0c-41fd-8be7-3292905bea13', N'Mushishi Zoku Shou: Suzu no Shizuku', N'Mushishi Zoku Shou: Suzu no Shizuku', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 35, N'written on their body', N'0', 6.254, 90, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2018, N'HD', 589782.0000, 9.1, 5879, N'img/live/live-6.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 16)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'c289c4e9-f9d3-4f8a-a0da-440966d4a31d', N'Fate/stay night Movie: Heaven''s Feel - II. Lost', N'Fate/stay night Movie: Heaven''s Feel - II. Lost', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 85, N'into the Abyss, never to be seen again', N'0', 5.964, 29, N'TV Series', N'960cafca-73f9-4d94-a9d1-333efacf16ab', 2019, N'HD', 284995.0000, 4.29, 5975, N'img/live/live-5.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 17)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'46a06bba-8266-4e3c-b931-4e24c7dd2552', N'Shouwa Genroku Rakugo Shinjuu', N'Shouwa Genroku Rakugo Shinjuu', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 58, N'mother’s last words send Hina', N'0', 7.965, 85, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2018, N'HD', 896112.0000, 8.9, 6597, N'img/live/live-1.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'The Seven Deadly Sins: Wrath of the Gods', N'The Seven Deadly Sins: Wrath of the Gods', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 24, N'Yuusha, Yamemasu Yuusha, Yamemasu Vietsub Yuusha, Yamemasu HD', N'0', 1.029, 20, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2020, N'HD', 131541.0000, 7.31, 1515, N'img/trending/trend-1.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'5fa50d25-34f0-41d5-a584-6cf70f03f1c3', N'Shirogane Tamashii hen Kouhan sen', N'Shirogane Tamashii hen Kouhan sen', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 56, N'human inhabiting the world', N'0', 2.597, 58, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 564231.0000, 6.28, 6523, N'img/popular/popular-3.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 20)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'319cbc0c-1595-424b-b2dd-7808009eaa9e', N'Kizumonogatari III: Reiket su-hen', N'Kizumonogatari III: Reiket su-hen', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 52, N'Alcia', N'1', 8.236, 25, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 235897.0000, 5.32, 2600, N'img/popular/popular-2.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 20)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe', N'Fate/stay night Movie: Heaven''s Feel - II. Lost', N'Fate/stay night Movie: Heaven''s Feel - II. Lost', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 43, N'Hina on a quest', N'1', 4.238, 62, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2017, N'HD', 785223.0000, 6.52, 4122, N'img/recent/recent-2.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'4a47c73d-bbea-4a44-851f-99c9aeaee4f9', N'Great Teacher Onizuka', N'Great Teacher Onizuka', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 23, N'Waste War - the fabled Ace!', N'0', 8.369, 50, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2018, N'HD', 123567.0000, 8.25, 8541, N'img/recent/recent-1.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 19)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'a4c965b0-3da6-49d3-968f-9a34c23879f8', N'The Seven Deadly Sins: Wrath of the Gods', N'The Seven Deadly Sins: Wrath of the Gods', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 63, N'Hina on a quest ', N'1', 2.187, 65, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 328798.0000, 8.65, 8456, N'img/live/live-4.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 21)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'f5052710-87b2-4a27-8b4b-a167f42da12b', N'Code Geass: Hangyaku no Lelouch R2', N'Code Geass: Hangyaku no Lelouch R2', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 85, N'xem phim BUILD-DIVIDE', N'0', 2.589, 52, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2022, N'HD', 582135.0000, 7.5, 1523, N'img/trending/trend-5.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 10)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'0bdb55eb-997a-4285-b1e4-a1ef9de8c9e8', N'Kizumonogatari II: Nekket su-hen', N'Kizumonogatari II: Nekket su-hen', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 41, N'Abyss', N'0', 4.369, 58, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2016, N'HD', 592112.0000, 7.69, 6522, N'img/recent/recent-5.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 17)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'71000a25-4d85-4bcf-9c71-a8bc8497529c', N'Fate/Zero 2nd Season', N'Fate/Zero 2nd Season', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 25, N'quest to find', N'1', 1.235, 63, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2017, N'HD', 592322.0000, 6.21, 4521, N'img/recent/recent-4.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 16)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'2c93180e-b65c-4821-94bc-af11626e5ba9', N'The Seven Deadly Sins: Wrath of the Gods', N'The Seven Deadly Sins: Wrath of the Gods', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 61, N'For Hina’s mother', N'0', 2.588, 41, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2016, N'HD', 258945.0000, 5.21, 5897, N'img/recent/recent-6.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 17)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'eda84774-d64a-43bf-beb4-b5f85eb2067b', N'Monogatari Series: Second Season', N'Monogatari Series: Second Season', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 52, N'Alcia ', N'1', 5.238, 21, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2019, N'HD', 128999.0000, 9.21, 5879, N'img/popular/popular-6.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'5998aa8e-861c-4e0c-a9da-c32ef1e57aad', N'Shiratorizawa Gakuen Koukou', N'Shiratorizawa Gakuen Koukou', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 25, N'Shang-Chi and the Legend of the Ten Rings Shang-Chi Và Huyền Thoại Thập Nhẫn', N'1', 1.289, 25, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2022, N'HD', 548999.0000, 8.2, 2500, N'img/trending/trend-6.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'49b98f06-b69e-497f-81b6-c475e6567b86', N'Mushishi Zoku Shou: Suzu no Shizuku', N'Mushishi Zoku Shou: Suzu no Shizuku', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 13, N'total drops', N'1', 8.259, 47, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2017, N'HD', 589921.0000, 5.23, 5422, N'img/recent/recent-3.jpg', 1, 0, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 18)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'808bb437-6301-4b2c-8a4b-d7fbcf5600ef', N'Rurouni Kenshin: Meiji Kenkaku Romantan', N'Rurouni Kenshin: Meiji Kenkaku Romantan', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 58, N'pulled into the Abyss', N'1', 2.698, 85, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2020, N'HD', 853658.0000, 5.65, 6511, N'img/popular/popular-4.jpg', 0, 0, 1, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 13)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'ded7b518-c500-42cd-8369-dc5cec086a68', N'Mushishi Zoku Shou 2nd Season', N'Mushishi Zoku Shou 2nd Season', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 72, N'branded by a “Count”', N'1', 5.298, 38, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2017, N'HD', 498662.0000, 8.61, 5642, N'img/live/live-2.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 13)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'a6afc28c-2b14-4d9c-a72c-dc76140ec85c', N'Kizumonogatari II: Nekketsu-hen', N'Kizumonogatari II: Nekketsu-hen', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!

', 63, N'Waste War - the fabled', N'0', 9.254, 56, N'Tv Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2015, N'HD', 257898.0000, 2.98, 2589, N'img/live/live-6.jpg', 0, 1, 0, 0, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 14)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'220808ea-fcd6-44c9-802c-e10319fea445', N'Gintama Movie 2: Kanketsu-hen - Yorozuya yo Eien', N'Gintama Movie 2: Kanketsu-hen - Yorozuya yo Eien', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 24, N' Hina', N'0', 1.029, 20, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2022, N'HD', 131541.0000, 7.31, 1515, N'img/trending/trend-2.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 16)
INSERT [dbo].[movie] ([movie_id], [title], [name], [overview], [runtime], [tagline], [status], [votes_avg], [votes_count], [type], [studios], [date_aired], [quality], [views], [scores_avg], [scores_count], [poster_path], [recently], [live], [popular], [trending], [user_id], [role_age]) VALUES (N'3494458f-6540-47df-ae1d-e2dcc50c28ce', N'The Seven Deadly Sins: Wrath of the Gods', N'The Seven Deadly Sins: Wrath of the Gods', N'Every human inhabiting the world of Alcia is branded by a “Count” or a number written on their body. For Hina’s mother, her total drops to 0 and she’s pulled into the Abyss, never to be seen again. But her mother’s last words send Hina on a quest to find a legendary hero from the Waste War - the fabled Ace!', 29, N'written on their body.', N'0', 6.254, 90, N'TV Series', N'18df5544-c0e2-44e3-a776-68cc68c3b64b', 2018, N'HD', 589782.0000, 9.1, 5879, N'img/trending/trend-1.jpg', 0, 0, 0, 1, N'574cba66-0dce-4ed0-87c8-50fa6a284820', 17)
GO
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'25965fff-303b-4f2c-a78e-0775cd0d6f54')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'6167f265-c628-4523-8118-0a1c662fd7b6')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'f1680e6f-9dc9-410a-a13f-23fef8709d16')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'c289c4e9-f9d3-4f8a-a0da-440966d4a31d')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'46a06bba-8266-4e3c-b931-4e24c7dd2552')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'2a00ba85-6696-4297-a36b-58ddc3a56538')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'5fa50d25-34f0-41d5-a584-6cf70f03f1c3')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'319cbc0c-1595-424b-b2dd-7808009eaa9e')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'4a47c73d-bbea-4a44-851f-99c9aeaee4f9')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'a4c965b0-3da6-49d3-968f-9a34c23879f8')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'f5052710-87b2-4a27-8b4b-a167f42da12b')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'0bdb55eb-997a-4285-b1e4-a1ef9de8c9e8')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'71000a25-4d85-4bcf-9c71-a8bc8497529c')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'2c93180e-b65c-4821-94bc-af11626e5ba9')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'eda84774-d64a-43bf-beb4-b5f85eb2067b')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'5998aa8e-861c-4e0c-a9da-c32ef1e57aad')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'49b98f06-b69e-497f-81b6-c475e6567b86')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'808bb437-6301-4b2c-8a4b-d7fbcf5600ef')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'ded7b518-c500-42cd-8369-dc5cec086a68')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'a6afc28c-2b14-4d9c-a72c-dc76140ec85c')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'220808ea-fcd6-44c9-802c-e10319fea445')
INSERT [dbo].[movie_company] ([company_id], [movie_id]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'3494458f-6540-47df-ae1d-e2dcc50c28ce')
GO
INSERT [dbo].[movie_country] ([movie_id], [country_id]) VALUES (N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59', N'd890f065-8965-48a7-8584-6eec12005840')
GO
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'25965fff-303b-4f2c-a78e-0775cd0d6f54', N'4cd6fab5-bcd2-45d6-ac6c-07072d0d6932')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'6167f265-c628-4523-8118-0a1c662fd7b6', N'd3d2ef5c-0c21-4015-940f-0aead7d0aee3')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'4acb200d-bb36-41e1-a05c-18c26c0cb2a4', N'aa821211-093a-47c8-9824-0fa98b0c48ac')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'4acb200d-bb36-41e1-a05c-18c26c0cb2a4', N'b3b3baea-192e-4676-bb15-e6c2a6a7d75d')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'f1680e6f-9dc9-410a-a13f-23fef8709d16', N'ef96d953-15d8-493c-b995-11076cf4feba')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59', N'd03e9613-faa0-41cd-ac5e-2a76e47a2873')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'ef27f830-7c0c-41fd-8be7-3292905bea13', N'3c7ac50c-d389-4465-8d13-43c4ee343d85')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'c289c4e9-f9d3-4f8a-a0da-440966d4a31d', N'cef76bec-b50b-410a-bbf4-4686a4c4a44e')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'46a06bba-8266-4e3c-b931-4e24c7dd2552', N'ffbe9d10-385c-45ae-b1ee-4e1cef40bb5a')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'e65ca989-9713-42a0-84f0-56e10b4bfa11')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'5fa50d25-34f0-41d5-a584-6cf70f03f1c3', N'084dbb59-da84-4f01-8a07-633c15731691')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'319cbc0c-1595-424b-b2dd-7808009eaa9e', N'f8b8b8f6-4f76-416d-876b-65172dc4f5f3')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe', N'e16668ec-f552-4f4d-8146-7a2ec3d59b69')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'4a47c73d-bbea-4a44-851f-99c9aeaee4f9', N'08a49d19-a598-4651-b0ef-9e0af315bcaa')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'a4c965b0-3da6-49d3-968f-9a34c23879f8', N'9e235824-3d29-4056-935f-a0fbe5ba9945')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'f5052710-87b2-4a27-8b4b-a167f42da12b', N'22008a1f-5a58-422a-bdcd-a1538cc0ee42')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'0bdb55eb-997a-4285-b1e4-a1ef9de8c9e8', N'20ef0465-339b-4897-8f2a-ad928df0e0d5')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'71000a25-4d85-4bcf-9c71-a8bc8497529c', N'8cebadc7-4b94-4202-86f1-b75ffac7c128')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'2c93180e-b65c-4821-94bc-af11626e5ba9', N'd2121497-3f3c-4e2a-bd4f-c0de7ce8ffc6')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'eda84774-d64a-43bf-beb4-b5f85eb2067b', N'8763f495-ac92-44ed-b062-c123d278a84b')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'5998aa8e-861c-4e0c-a9da-c32ef1e57aad', N'a5d61972-1b15-4e33-8783-d3bdcee869bd')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'49b98f06-b69e-497f-81b6-c475e6567b86', N'd2798fca-dedb-4a73-8d40-d71caee962be')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'808bb437-6301-4b2c-8a4b-d7fbcf5600ef', N'b3b3baea-192e-4676-bb15-e6c2a6a7d75d')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'ded7b518-c500-42cd-8369-dc5cec086a68', N'3319394c-fb2f-4ace-afc2-e86bd7c9dc0c')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'a6afc28c-2b14-4d9c-a72c-dc76140ec85c', N'2dd3787c-f91e-44b4-827a-ef41dd59c293')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'220808ea-fcd6-44c9-802c-e10319fea445', N'3d98a555-64b8-479f-834a-fd2e0ebf931b')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'3494458f-6540-47df-ae1d-e2dcc50c28ce', N'8763f495-ac92-44ed-b062-c123d278a84b')
INSERT [dbo].[movie_episode] ([movie_id], [episode]) VALUES (N'3494458f-6540-47df-ae1d-e2dcc50c28ce', N'1ec27168-a591-434d-a7d1-ffdcc654b894')
GO
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'5cee56e5-6d5d-4025-824b-053723df122c', N'6167f265-c628-4523-8118-0a1c662fd7b6')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'a29d50c5-27be-4adb-a388-1e5505cd9ece', N'6167f265-c628-4523-8118-0a1c662fd7b6')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'0cc22178-8a2b-417b-9523-292cec7a230b', N'f1680e6f-9dc9-410a-a13f-23fef8709d16')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'0cc22178-8a2b-417b-9523-292cec7a230b', N'49b98f06-b69e-497f-81b6-c475e6567b86')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'f6fa152c-b1da-4fb2-87fd-476731409247', N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'f6fa152c-b1da-4fb2-87fd-476731409247', N'f5052710-87b2-4a27-8b4b-a167f42da12b')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'f6fa152c-b1da-4fb2-87fd-476731409247', N'5998aa8e-861c-4e0c-a9da-c32ef1e57aad')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'f6fa152c-b1da-4fb2-87fd-476731409247', N'ded7b518-c500-42cd-8369-dc5cec086a68')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'928c1083-1438-41c3-9ad9-65a6520ffad0', N'4acb200d-bb36-41e1-a05c-18c26c0cb2a4')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'928c1083-1438-41c3-9ad9-65a6520ffad0', N'c289c4e9-f9d3-4f8a-a0da-440966d4a31d')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'928c1083-1438-41c3-9ad9-65a6520ffad0', N'eda84774-d64a-43bf-beb4-b5f85eb2067b')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'928c1083-1438-41c3-9ad9-65a6520ffad0', N'808bb437-6301-4b2c-8a4b-d7fbcf5600ef')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'6ef055ae-7e16-4a60-acb1-6daf30556242', N'46a06bba-8266-4e3c-b931-4e24c7dd2552')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'6ef055ae-7e16-4a60-acb1-6daf30556242', N'a4c965b0-3da6-49d3-968f-9a34c23879f8')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'a704244c-25d3-4e16-8902-700e2cacf5f9', N'2a00ba85-6696-4297-a36b-58ddc3a56538')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'a704244c-25d3-4e16-8902-700e2cacf5f9', N'a6afc28c-2b14-4d9c-a72c-dc76140ec85c')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'692e05db-f14d-4abf-af78-7626c297f1df', N'25965fff-303b-4f2c-a78e-0775cd0d6f54')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'692e05db-f14d-4abf-af78-7626c297f1df', N'5fa50d25-34f0-41d5-a584-6cf70f03f1c3')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'692e05db-f14d-4abf-af78-7626c297f1df', N'a4c965b0-3da6-49d3-968f-9a34c23879f8')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'692e05db-f14d-4abf-af78-7626c297f1df', N'220808ea-fcd6-44c9-802c-e10319fea445')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'07b96fa4-6a0f-4e73-9de5-a60ce8560d46', N'319cbc0c-1595-424b-b2dd-7808009eaa9e')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'07b96fa4-6a0f-4e73-9de5-a60ce8560d46', N'0bdb55eb-997a-4285-b1e4-a1ef9de8c9e8')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'07b96fa4-6a0f-4e73-9de5-a60ce8560d46', N'3494458f-6540-47df-ae1d-e2dcc50c28ce')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'7aa13aa5-ca7c-41b8-b936-ad8d9da4342d', N'4acb200d-bb36-41e1-a05c-18c26c0cb2a4')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'7aa13aa5-ca7c-41b8-b936-ad8d9da4342d', N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'7aa13aa5-ca7c-41b8-b936-ad8d9da4342d', N'71000a25-4d85-4bcf-9c71-a8bc8497529c')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'46c92196-8320-4fd9-b33d-b37e4c741726', N'4a47c73d-bbea-4a44-851f-99c9aeaee4f9')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'46c92196-8320-4fd9-b33d-b37e4c741726', N'2c93180e-b65c-4821-94bc-af11626e5ba9')
INSERT [dbo].[movie_genres] ([genres_id], [movie_id]) VALUES (N'a1d85d26-6200-465a-aa1c-b84390cfa3fd', N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe')
GO
INSERT [dbo].[movie_season] ([season_id], [movie_id]) VALUES (N'8e77e261-4a62-4184-8e71-223db14a456a', N'25965fff-303b-4f2c-a78e-0775cd0d6f54')
GO
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'25965fff-303b-4f2c-a78e-0775cd0d6f54', N'f9a56936-8c55-4543-9c3b-01d977e4996a')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'25965fff-303b-4f2c-a78e-0775cd0d6f54', N'0beea952-ec5f-47f3-a384-441fc4585f44')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'f1680e6f-9dc9-410a-a13f-23fef8709d16', N'3c0d2912-c6f0-4140-b033-7a1dd4f65906')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59', N'67921759-9bd1-4b14-b76d-853245e3f1e0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'b3f62455-f9ba-4afa-9bbc-2bf8722c4a59', N'9c842a4f-6779-429f-a674-abdba60d21f0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'c289c4e9-f9d3-4f8a-a0da-440966d4a31d', N'2a4ead85-5c1a-45bf-87d8-9db96a4eae91')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'46a06bba-8266-4e3c-b931-4e24c7dd2552', N'9c842a4f-6779-429f-a674-abdba60d21f0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'67921759-9bd1-4b14-b76d-853245e3f1e0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'9c842a4f-6779-429f-a674-abdba60d21f0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'8ae55420-71e9-43bc-9aca-b012df4faadc')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'85947e91-7068-465b-bd10-c485daf40f9f')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'5fa50d25-34f0-41d5-a584-6cf70f03f1c3', N'85947e91-7068-465b-bd10-c485daf40f9f')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'319cbc0c-1595-424b-b2dd-7808009eaa9e', N'a3c84092-6e49-4862-ac22-dba20b8c04c0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe', N'2a4ead85-5c1a-45bf-87d8-9db96a4eae91')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'4ad9f536-ebd2-44af-aff4-7a83202fa4fe', N'8ae55420-71e9-43bc-9aca-b012df4faadc')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'f5052710-87b2-4a27-8b4b-a167f42da12b', N'67921759-9bd1-4b14-b76d-853245e3f1e0')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'5998aa8e-861c-4e0c-a9da-c32ef1e57aad', N'85947e91-7068-465b-bd10-c485daf40f9f')
INSERT [dbo].[movie_series] ([movie_id], [series_id]) VALUES (N'220808ea-fcd6-44c9-802c-e10319fea445', N'9c842a4f-6779-429f-a674-abdba60d21f0')
GO
INSERT [dbo].[production_company] ([company_id], [name]) VALUES (N'18df5544-c0e2-44e3-a776-68cc68c3b64b', N'フェイト／ステイナイト, Feito／sutei naito')
GO
INSERT [dbo].[review] ([review_id], [user_id], [comment], [created_at], [status], [movie_id], [blog_id], [count_like], [review_reply]) VALUES (N'f1ad1bc6-02f6-4efb-b1e7-10e6963a5ffc', N'574cba66-0dce-4ed0-87c8-50fa6a284820', N'no happy', CAST(N'2022-06-29T00:00:00.000' AS DateTime), 1, N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'18c5db31-cc7d-4797-b236-2342627319ff', 2, N'af9b28b7-bb75-49af-8b2b-b6e7d3d30d20')
INSERT [dbo].[review] ([review_id], [user_id], [comment], [created_at], [status], [movie_id], [blog_id], [count_like], [review_reply]) VALUES (N'03661e3b-2a97-4d15-adab-4ad92d2338f1', N'574cba66-0dce-4ed0-87c8-50fa6a284820', N'fukk', CAST(N'2022-07-08T00:00:00.000' AS DateTime), 1, NULL, N'18c5db31-cc7d-4797-b236-2342627319ff', NULL, NULL)
INSERT [dbo].[review] ([review_id], [user_id], [comment], [created_at], [status], [movie_id], [blog_id], [count_like], [review_reply]) VALUES (N'af9b28b7-bb75-49af-8b2b-b6e7d3d30d20', N'574cba66-0dce-4ed0-87c8-50fa6a284820', N'yes pls', CAST(N'2022-06-29T00:00:00.000' AS DateTime), 1, N'2a00ba85-6696-4297-a36b-58ddc3a56538', N'18c5db31-cc7d-4797-b236-2342627319ff', 3, NULL)
INSERT [dbo].[review] ([review_id], [user_id], [comment], [created_at], [status], [movie_id], [blog_id], [count_like], [review_reply]) VALUES (N'f087b4e8-68d1-4533-abab-f94ec29cd250', N'574cba66-0dce-4ed0-87c8-50fa6a284820', N'ok luon', CAST(N'2022-07-08T00:00:00.000' AS DateTime), 0, N'f1680e6f-9dc9-410a-a13f-23fef8709d16', N'18c5db31-cc7d-4797-b236-2342627319ff', 2, N'af9b28b7-bb75-49af-8b2b-b6e7d3d30d20')
GO
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'8e77e261-4a62-4184-8e71-223db14a456a', 2010, 2013)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'd42f6dae-1fd4-48ec-8f6f-226839f4c521', 2013, 2014)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'8567c589-cd4f-45b0-9da4-51482873d602', 2020, 2021)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'65bcc623-58e4-493f-acff-5fc10b9f5928', 2011, 2012)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'17c106bf-c5e7-47c9-9d07-77760c84f8cb', 2014, 2015)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'c8f2e828-d5f7-4bdb-a548-7d5bd299a0c7', 2021, 2022)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'7f9e75ac-a4f5-4680-b3a2-851690e2eed5', 2016, 2017)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'6fc21c3f-7ab3-435e-8c3d-9dd82bb1e81e', 2015, 2016)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'a2854ae8-c3b5-4501-aff7-cfbba198183c', 2012, 2013)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'2fa2ba57-8f6e-4f4e-95a2-df50337521f5', 2019, 2020)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'af2b3789-76b7-4eb0-8be8-fc1c0280583a', 2018, 2019)
INSERT [dbo].[season] ([season_id], [start_year], [end_year]) VALUES (N'f7af9bc3-50d3-48cf-8ad7-fcfe3c752389', 2017, 2019)
GO
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'f9a56936-8c55-4543-9c3b-01d977e4996a', N'Phim Bộ Hàn Quốc', 2022, N'5cee56e5-6d5d-4025-824b-053723df122c')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'0beea952-ec5f-47f3-a384-441fc4585f44', N'Phim Bộ Nhật Bản', 2010, N'5cee56e5-6d5d-4025-824b-053723df122c')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'3c0d2912-c6f0-4140-b033-7a1dd4f65906', N'Phim Bộ Trung Quốc', 2012, N'a29d50c5-27be-4adb-a388-1e5505cd9ece')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'67921759-9bd1-4b14-b76d-853245e3f1e0', N'Phim Bộ Đài Loan', 2020, N'0cc22178-8a2b-417b-9523-292cec7a230b')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'2a4ead85-5c1a-45bf-87d8-9db96a4eae91', N'Phim Bộ Ấn Độ', 2019, N'a29d50c5-27be-4adb-a388-1e5505cd9ece')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'9c842a4f-6779-429f-a674-abdba60d21f0', N'Phim Bộ Thái Lan', 2018, N'0cc22178-8a2b-417b-9523-292cec7a230b')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'8ae55420-71e9-43bc-9aca-b012df4faadc', N'Phim Bộ Philippines', 2017, N'0cc22178-8a2b-417b-9523-292cec7a230b')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'85947e91-7068-465b-bd10-c485daf40f9f', N'Phim Bộ Hồng Kông', 2016, N'46c92196-8320-4fd9-b33d-b37e4c741726')
INSERT [dbo].[series] ([series_id], [title], [start_year], [genre]) VALUES (N'a3c84092-6e49-4862-ac22-dba20b8c04c0', N'Phim Bộ Mỹ', 2015, N'692e05db-f14d-4abf-af78-7626c297f1df')
GO
SET IDENTITY_INSERT [dbo].[slides] ON 

INSERT [dbo].[slides] ([id], [img], [caption], [contents], [link]) VALUES (1, N'img/hero/hero-1.jpg', N'Fate / Stay Night: Unlimited Blade Works', N'After 30 days of travel across the world...', N'videos/1.mp4')
INSERT [dbo].[slides] ([id], [img], [caption], [contents], [link]) VALUES (2, N'img/hero/hero-1.jpg', N'Fate / Stay Night: Unlimited Blade Works', N'After 20 days of travel across the world...', N'videos/1.mp4')
INSERT [dbo].[slides] ([id], [img], [caption], [contents], [link]) VALUES (3, N'img/hero/hero-1.jpg', N'Fate / Stay Night: Unlimited Blade Works', N'After 80 days of travel across the world...', N'videos/1.mp4')
SET IDENTITY_INSERT [dbo].[slides] OFF
GO
INSERT [dbo].[users] ([user_id], [first_name], [last_name], [email], [phone], [password], [access_tokenID], [path_img]) VALUES (N'574cba66-0dce-4ed0-87c8-50fa6a284820', N'anh', N'thu', N'porkoe3443334@gmail.com', N'0932904529', N'1234', NULL, N'img/anime/review-1.jpg')
INSERT [dbo].[users] ([user_id], [first_name], [last_name], [email], [phone], [password], [access_tokenID], [path_img]) VALUES (N'38ec11b0-8661-4e1d-a5f4-b91c347f85f6', N'ty', N'khung', N'tykhung@gmail.com', N'0123589256', N'12345', NULL, NULL)
GO
ALTER TABLE [dbo].[about] ADD  CONSTRAINT [DF_About_about_id]  DEFAULT (newid()) FOR [about_id]
GO
ALTER TABLE [dbo].[blog_detail] ADD  CONSTRAINT [DF_blog_detail_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[blog_genres] ADD  CONSTRAINT [DF_blog_genres_genres_id]  DEFAULT (newid()) FOR [genres_id]
GO
ALTER TABLE [dbo].[blog_genres] ADD  CONSTRAINT [DF_blog_genres_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[blogs] ADD  CONSTRAINT [DF_blogs_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[country] ADD  CONSTRAINT [DF_Country_country_id]  DEFAULT (newid()) FOR [country_id]
GO
ALTER TABLE [dbo].[episode] ADD  CONSTRAINT [DF_episode_episode_id]  DEFAULT (newid()) FOR [episode_id]
GO
ALTER TABLE [dbo].[favorite] ADD  CONSTRAINT [DF_favorite_favorite_id]  DEFAULT (newid()) FOR [favorite_id]
GO
ALTER TABLE [dbo].[favorite] ADD  CONSTRAINT [DF_favorite_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[genres] ADD  CONSTRAINT [DF_Table_1_genres_id
genres_id]  DEFAULT (newid()) FOR [genres_id]
GO
ALTER TABLE [dbo].[image_blogs] ADD  CONSTRAINT [DF_image_blogs_image_id]  DEFAULT (newid()) FOR [image_id]
GO
ALTER TABLE [dbo].[image_blogs] ADD  CONSTRAINT [DF_image_blogs_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[keyword] ADD  CONSTRAINT [DF_keyword_keyword_id]  DEFAULT (newid()) FOR [keyword_id]
GO
ALTER TABLE [dbo].[keyword_blog] ADD  CONSTRAINT [DF_keyword_blog_keyword_id]  DEFAULT (newid()) FOR [keyword_id]
GO
ALTER TABLE [dbo].[keyword_blog] ADD  CONSTRAINT [DF_keyword_blog_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[menus] ADD  CONSTRAINT [DF_Menus_menus_id]  DEFAULT (newid()) FOR [menus_id]
GO
ALTER TABLE [dbo].[movie] ADD  CONSTRAINT [DF_movie_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie] ADD  CONSTRAINT [DF_movie_studios]  DEFAULT (newid()) FOR [studios]
GO
ALTER TABLE [dbo].[movie] ADD  CONSTRAINT [DF_movie_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[movie_cast] ADD  CONSTRAINT [DF_movie_cast_person_id]  DEFAULT (newid()) FOR [person_id]
GO
ALTER TABLE [dbo].[movie_cast] ADD  CONSTRAINT [DF_movie_cast_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_company] ADD  CONSTRAINT [DF_movie_company_company_id]  DEFAULT (newid()) FOR [company_id]
GO
ALTER TABLE [dbo].[movie_company] ADD  CONSTRAINT [DF_movie_company_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_country] ADD  CONSTRAINT [DF_movie_country_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_country] ADD  CONSTRAINT [DF_movie_country_country_id]  DEFAULT (newid()) FOR [country_id]
GO
ALTER TABLE [dbo].[movie_episode] ADD  CONSTRAINT [DF_movie_episode_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_episode] ADD  CONSTRAINT [DF_movie_episode_episode]  DEFAULT (newid()) FOR [episode]
GO
ALTER TABLE [dbo].[movie_favorite] ADD  CONSTRAINT [DF_movie_favorite_favorite_id]  DEFAULT (newid()) FOR [favorite_id]
GO
ALTER TABLE [dbo].[movie_favorite] ADD  CONSTRAINT [DF_movie_favorite_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_genres] ADD  CONSTRAINT [DF_Movie_Genres_genres_id]  DEFAULT (newid()) FOR [genres_id]
GO
ALTER TABLE [dbo].[movie_genres] ADD  CONSTRAINT [DF_Movie_Genres_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_keyword] ADD  CONSTRAINT [DF_movie_keyword_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_keyword] ADD  CONSTRAINT [DF_movie_keyword_keyword_id]  DEFAULT (newid()) FOR [keyword_id]
GO
ALTER TABLE [dbo].[movie_season] ADD  CONSTRAINT [DF_movie_season_season_id]  DEFAULT (newid()) FOR [season_id]
GO
ALTER TABLE [dbo].[movie_season] ADD  CONSTRAINT [DF_movie_season_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_series] ADD  CONSTRAINT [DF_movie_series_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[movie_series] ADD  CONSTRAINT [DF_movie_series_series_id]  DEFAULT (newid()) FOR [series_id]
GO
ALTER TABLE [dbo].[movie_watch] ADD  CONSTRAINT [DF_movie_watch_watch_id]  DEFAULT (newid()) FOR [watch_id]
GO
ALTER TABLE [dbo].[movie_watch] ADD  CONSTRAINT [DF_movie_watch_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[person] ADD  CONSTRAINT [DF_person_person_id]  DEFAULT (newid()) FOR [person_id]
GO
ALTER TABLE [dbo].[production_company] ADD  CONSTRAINT [DF_production_company_company_id]  DEFAULT (newid()) FOR [company_id]
GO
ALTER TABLE [dbo].[rating] ADD  CONSTRAINT [DF_rating_rating_id]  DEFAULT (newid()) FOR [rating_id]
GO
ALTER TABLE [dbo].[rating] ADD  CONSTRAINT [DF_rating_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[review] ADD  CONSTRAINT [DF_review_review_id]  DEFAULT (newid()) FOR [review_id]
GO
ALTER TABLE [dbo].[review] ADD  CONSTRAINT [DF_review_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[review] ADD  CONSTRAINT [DF_review_movie_id]  DEFAULT (newid()) FOR [movie_id]
GO
ALTER TABLE [dbo].[review] ADD  CONSTRAINT [DF_review_blog_id]  DEFAULT (newid()) FOR [blog_id]
GO
ALTER TABLE [dbo].[review] ADD  CONSTRAINT [DF_review_review_reply]  DEFAULT (newid()) FOR [review_reply]
GO
ALTER TABLE [dbo].[role_user] ADD  CONSTRAINT [DF_role_user_role_id]  DEFAULT (newid()) FOR [role_id]
GO
ALTER TABLE [dbo].[role_user] ADD  CONSTRAINT [DF_role_user_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[roles] ADD  CONSTRAINT [DF_roles_role_id]  DEFAULT (newid()) FOR [role_id]
GO
ALTER TABLE [dbo].[season] ADD  CONSTRAINT [DF_season_season_id]  DEFAULT (newid()) FOR [season_id]
GO
ALTER TABLE [dbo].[series] ADD  CONSTRAINT [DF_series_series_id]  DEFAULT (newid()) FOR [series_id]
GO
ALTER TABLE [dbo].[series] ADD  CONSTRAINT [DF_series_genre]  DEFAULT (newid()) FOR [genre]
GO
ALTER TABLE [dbo].[users] ADD  CONSTRAINT [DF_user_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[watch] ADD  CONSTRAINT [DF_watch_watch_id]  DEFAULT (newid()) FOR [watch_id]
GO
ALTER TABLE [dbo].[watch] ADD  CONSTRAINT [DF_watch_user_id]  DEFAULT (newid()) FOR [user_id]
GO
ALTER TABLE [dbo].[blog_detail]  WITH CHECK ADD  CONSTRAINT [FK_blog_detail_blogs1] FOREIGN KEY([blog_id])
REFERENCES [dbo].[blogs] ([blog_id])
GO
ALTER TABLE [dbo].[blog_detail] CHECK CONSTRAINT [FK_blog_detail_blogs1]
GO
ALTER TABLE [dbo].[blog_genres]  WITH CHECK ADD  CONSTRAINT [FK_blog_genres_blogs] FOREIGN KEY([blog_id])
REFERENCES [dbo].[blogs] ([blog_id])
GO
ALTER TABLE [dbo].[blog_genres] CHECK CONSTRAINT [FK_blog_genres_blogs]
GO
ALTER TABLE [dbo].[blog_genres]  WITH CHECK ADD  CONSTRAINT [FK_blog_genres_genres] FOREIGN KEY([genres_id])
REFERENCES [dbo].[genres] ([genres_id])
GO
ALTER TABLE [dbo].[blog_genres] CHECK CONSTRAINT [FK_blog_genres_genres]
GO
ALTER TABLE [dbo].[favorite]  WITH CHECK ADD  CONSTRAINT [FK_favorite_user] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[favorite] CHECK CONSTRAINT [FK_favorite_user]
GO
ALTER TABLE [dbo].[image_blogs]  WITH CHECK ADD  CONSTRAINT [FK_image_blogs_blogs] FOREIGN KEY([blog_id])
REFERENCES [dbo].[blogs] ([blog_id])
GO
ALTER TABLE [dbo].[image_blogs] CHECK CONSTRAINT [FK_image_blogs_blogs]
GO
ALTER TABLE [dbo].[keyword_blog]  WITH CHECK ADD  CONSTRAINT [FK_keyword_blog_blogs] FOREIGN KEY([blog_id])
REFERENCES [dbo].[blogs] ([blog_id])
GO
ALTER TABLE [dbo].[keyword_blog] CHECK CONSTRAINT [FK_keyword_blog_blogs]
GO
ALTER TABLE [dbo].[keyword_blog]  WITH CHECK ADD  CONSTRAINT [FK_keyword_blog_keyword] FOREIGN KEY([keyword_id])
REFERENCES [dbo].[keyword] ([keyword_id])
GO
ALTER TABLE [dbo].[keyword_blog] CHECK CONSTRAINT [FK_keyword_blog_keyword]
GO
ALTER TABLE [dbo].[movie]  WITH CHECK ADD  CONSTRAINT [FK_movie_user] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[movie] CHECK CONSTRAINT [FK_movie_user]
GO
ALTER TABLE [dbo].[movie_cast]  WITH CHECK ADD  CONSTRAINT [FK_movie_cast_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_cast] CHECK CONSTRAINT [FK_movie_cast_movie]
GO
ALTER TABLE [dbo].[movie_cast]  WITH CHECK ADD  CONSTRAINT [FK_movie_cast_person] FOREIGN KEY([person_id])
REFERENCES [dbo].[person] ([person_id])
GO
ALTER TABLE [dbo].[movie_cast] CHECK CONSTRAINT [FK_movie_cast_person]
GO
ALTER TABLE [dbo].[movie_company]  WITH CHECK ADD  CONSTRAINT [FK_movie_company_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_company] CHECK CONSTRAINT [FK_movie_company_movie]
GO
ALTER TABLE [dbo].[movie_company]  WITH CHECK ADD  CONSTRAINT [FK_movie_company_production_company] FOREIGN KEY([company_id])
REFERENCES [dbo].[production_company] ([company_id])
GO
ALTER TABLE [dbo].[movie_company] CHECK CONSTRAINT [FK_movie_company_production_company]
GO
ALTER TABLE [dbo].[movie_country]  WITH CHECK ADD  CONSTRAINT [FK_movie_country_country] FOREIGN KEY([country_id])
REFERENCES [dbo].[country] ([country_id])
GO
ALTER TABLE [dbo].[movie_country] CHECK CONSTRAINT [FK_movie_country_country]
GO
ALTER TABLE [dbo].[movie_country]  WITH CHECK ADD  CONSTRAINT [FK_movie_country_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_country] CHECK CONSTRAINT [FK_movie_country_movie]
GO
ALTER TABLE [dbo].[movie_episode]  WITH CHECK ADD  CONSTRAINT [FK_movie_episode_episode] FOREIGN KEY([episode])
REFERENCES [dbo].[episode] ([episode_id])
GO
ALTER TABLE [dbo].[movie_episode] CHECK CONSTRAINT [FK_movie_episode_episode]
GO
ALTER TABLE [dbo].[movie_episode]  WITH CHECK ADD  CONSTRAINT [FK_movie_episode_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_episode] CHECK CONSTRAINT [FK_movie_episode_movie]
GO
ALTER TABLE [dbo].[movie_favorite]  WITH CHECK ADD  CONSTRAINT [FK_movie_favorite_favorite] FOREIGN KEY([favorite_id])
REFERENCES [dbo].[favorite] ([favorite_id])
GO
ALTER TABLE [dbo].[movie_favorite] CHECK CONSTRAINT [FK_movie_favorite_favorite]
GO
ALTER TABLE [dbo].[movie_favorite]  WITH CHECK ADD  CONSTRAINT [FK_movie_favorite_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_favorite] CHECK CONSTRAINT [FK_movie_favorite_movie]
GO
ALTER TABLE [dbo].[movie_genres]  WITH CHECK ADD  CONSTRAINT [FK_movie_genres_genres] FOREIGN KEY([genres_id])
REFERENCES [dbo].[genres] ([genres_id])
GO
ALTER TABLE [dbo].[movie_genres] CHECK CONSTRAINT [FK_movie_genres_genres]
GO
ALTER TABLE [dbo].[movie_genres]  WITH CHECK ADD  CONSTRAINT [FK_movie_genres_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_genres] CHECK CONSTRAINT [FK_movie_genres_movie]
GO
ALTER TABLE [dbo].[movie_keyword]  WITH CHECK ADD  CONSTRAINT [FK_movie_keyword_keyword] FOREIGN KEY([keyword_id])
REFERENCES [dbo].[keyword] ([keyword_id])
GO
ALTER TABLE [dbo].[movie_keyword] CHECK CONSTRAINT [FK_movie_keyword_keyword]
GO
ALTER TABLE [dbo].[movie_keyword]  WITH CHECK ADD  CONSTRAINT [FK_movie_keyword_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_keyword] CHECK CONSTRAINT [FK_movie_keyword_movie]
GO
ALTER TABLE [dbo].[movie_season]  WITH CHECK ADD  CONSTRAINT [FK_movie_season_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_season] CHECK CONSTRAINT [FK_movie_season_movie]
GO
ALTER TABLE [dbo].[movie_season]  WITH CHECK ADD  CONSTRAINT [FK_movie_season_season] FOREIGN KEY([season_id])
REFERENCES [dbo].[season] ([season_id])
GO
ALTER TABLE [dbo].[movie_season] CHECK CONSTRAINT [FK_movie_season_season]
GO
ALTER TABLE [dbo].[movie_series]  WITH CHECK ADD  CONSTRAINT [FK_movie_series_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_series] CHECK CONSTRAINT [FK_movie_series_movie]
GO
ALTER TABLE [dbo].[movie_series]  WITH CHECK ADD  CONSTRAINT [FK_movie_series_series] FOREIGN KEY([series_id])
REFERENCES [dbo].[series] ([series_id])
GO
ALTER TABLE [dbo].[movie_series] CHECK CONSTRAINT [FK_movie_series_series]
GO
ALTER TABLE [dbo].[movie_watch]  WITH CHECK ADD  CONSTRAINT [FK_movie_watch_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[movie_watch] CHECK CONSTRAINT [FK_movie_watch_movie]
GO
ALTER TABLE [dbo].[movie_watch]  WITH CHECK ADD  CONSTRAINT [FK_movie_watch_watch] FOREIGN KEY([watch_id])
REFERENCES [dbo].[watch] ([watch_id])
GO
ALTER TABLE [dbo].[movie_watch] CHECK CONSTRAINT [FK_movie_watch_watch]
GO
ALTER TABLE [dbo].[rating]  WITH CHECK ADD  CONSTRAINT [FK_rating_movie1] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[rating] CHECK CONSTRAINT [FK_rating_movie1]
GO
ALTER TABLE [dbo].[review]  WITH CHECK ADD  CONSTRAINT [FK_review_blogs] FOREIGN KEY([blog_id])
REFERENCES [dbo].[blogs] ([blog_id])
GO
ALTER TABLE [dbo].[review] CHECK CONSTRAINT [FK_review_blogs]
GO
ALTER TABLE [dbo].[review]  WITH CHECK ADD  CONSTRAINT [FK_review_movie] FOREIGN KEY([movie_id])
REFERENCES [dbo].[movie] ([movie_id])
GO
ALTER TABLE [dbo].[review] CHECK CONSTRAINT [FK_review_movie]
GO
ALTER TABLE [dbo].[review]  WITH CHECK ADD  CONSTRAINT [FK_review_review1] FOREIGN KEY([review_reply])
REFERENCES [dbo].[review] ([review_id])
GO
ALTER TABLE [dbo].[review] CHECK CONSTRAINT [FK_review_review1]
GO
ALTER TABLE [dbo].[review]  WITH CHECK ADD  CONSTRAINT [FK_review_users] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[review] CHECK CONSTRAINT [FK_review_users]
GO
ALTER TABLE [dbo].[role_user]  WITH CHECK ADD  CONSTRAINT [FK_role_user_roles] FOREIGN KEY([role_id])
REFERENCES [dbo].[roles] ([role_id])
GO
ALTER TABLE [dbo].[role_user] CHECK CONSTRAINT [FK_role_user_roles]
GO
ALTER TABLE [dbo].[role_user]  WITH CHECK ADD  CONSTRAINT [FK_role_user_user] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[role_user] CHECK CONSTRAINT [FK_role_user_user]
GO
ALTER TABLE [dbo].[series]  WITH CHECK ADD  CONSTRAINT [FK_series_genres] FOREIGN KEY([genre])
REFERENCES [dbo].[genres] ([genres_id])
GO
ALTER TABLE [dbo].[series] CHECK CONSTRAINT [FK_series_genres]
GO
ALTER TABLE [dbo].[watch]  WITH CHECK ADD  CONSTRAINT [FK_watch_user] FOREIGN KEY([user_id])
REFERENCES [dbo].[users] ([user_id])
GO
ALTER TABLE [dbo].[watch] CHECK CONSTRAINT [FK_watch_user]
GO
