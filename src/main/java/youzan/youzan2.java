package youzan;

public class youzan2 {
/*
    #include<iostream>
#include<algorithm>
#include<cstring>
#include<cstdio>
#include<vector>
    using namespace std;
#define maxn 100005
            #define PP pair<int,int>
#define mp(a,b) make_pair(a,b)
            #define fi first
#define se second
#define pb(x) push_back(x)
    inline int read() {
        register char ch;
        while(!isdigit(ch=getchar()));
        register int x=ch^'0';
        while(isdigit(ch=getchar())) x=(((x<<2)+x)<<1)+(ch^'0');
        return x;
    }
    vector<PP>E[maxn];
    int n,m,vis[maxn],tim,fa[maxn],deg[maxn],root;
    double ans,D[maxn],F[maxn],G[maxn],tmp[maxn];
    bool cir[maxn];
    void dfs1(int u,int pre){
        vis[u]=1;
        for(int i=0;i<E[u].size();++i){
            int v=E[u][i].fi,w=E[u][i].se;
            if(v!=pre&&!cir[v]){
                dfs1(v,u);
                ++deg[u];
                D[u]+=F[v]+w;
            }
        }
        F[u]=D[u]/(double)max(1,deg[u]);
        if(u!=root) ++deg[u];
    }
    void dfs2(int u,int pre){
        vis[u]=1;
        for(int i=0;i<E[u].size();++i){
            int v=E[u][i].fi,w=E[u][i].se;
            if(v!=pre&&!cir[v]){
                D[v]+=(D[u]-F[v]-w)/(double)max(1,deg[u]-1)+w;
                dfs2(v,u);
            }
        }
    }
    void dfs3(int u){
        vis[u]=1;
        for(int i=0,j;i<E[u].size();++i){
            int v=E[u][i].fi;
            if(v!=fa[u]){
                if(!vis[v]){ fa[v]=u; dfs3(v); }
                else if(!cir[v])
                    for(cir[v]=1,j=u;j!=v;j=fa[j])
                        cir[j]=1;
            }
        }
    }
    void dfs4(int u,int pre){
        bool flag=0; G[u]=0;
        for(int i=0;i<E[u].size();++i){
            int v=E[u][i].fi,w=E[u][i].se;
            if(v!=root&&v!=pre&&cir[v]){
                flag=1; dfs4(v,u);
                G[u]+=G[v]+w;
            }
        }
        if(u==root) return;
        int k=deg[u];
        if(!flag) G[u]=D[u]/(double)max(1,k);
        else{ k=deg[u]+1; G[u]=(G[u]+D[u])/(double)k; }
    }
    int main(){
        n=read(); m=read();
        for(int i=1;i<=m;++i){
            int x,y,w; x=read(); y=read(); w=read();
            E[x].pb(mp(y,w));
            E[y].pb(mp(x,w));
        }
        if(m==n-1){
            root=1;
            dfs1(1,0);
            dfs2(1,0);
        } else {
            dfs3(1);
            for(int i=1;i<=n;++i) if(cir[i]){ root=i; dfs1(i,0); }
            for(int i=1;i<=n;++i) if(cir[i]){ root=i; dfs4(i,0); tmp[i]=G[i]; }
            for(int i=1;i<=n;++i) if(cir[i]){ deg[i]+=2; D[i]+=tmp[i]; }
            for(int i=1;i<=n;++i) if(cir[i]){ root=i; dfs2(i,0); }
        }
        for(int i=1;i<=n;++i) ans+=D[i]/(double)deg[i];
        printf("%.5lf",ans/(double)n);
        return 0;
    }
*/
}
