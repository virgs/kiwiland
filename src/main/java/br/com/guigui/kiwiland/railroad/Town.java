package br.com.guigui.kiwiland.railroad;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Town
{
	String name;
	private Map<String, Track> tracks;
	
	public Town(String name)
	{
		this.name = name;
		tracks = new HashMap<String, Track>();
	}

	public String getName()
	{
		return name;
	}

	public void addTrack(Track track)
	{
		tracks.put(track.getDestiny().getName(), track);
	}

	public Collection<Track> getTracks()
	{
		return tracks.values();
	}

}
